package com.clone.composeintagram.ui.reels

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.clone.composeintagram.base.cameraVector
import com.clone.composeintagram.ui.reels.components.Video
import com.google.android.exoplayer2.C
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.source.ProgressiveMediaSource
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource
import com.google.android.exoplayer2.upstream.cache.Cache
import com.google.android.exoplayer2.upstream.cache.CacheDataSource
import dev.chrisbanes.snapper.ExperimentalSnapperApi
import dev.chrisbanes.snapper.SnapOffsets
import dev.chrisbanes.snapper.rememberSnapperFlingBehavior
import kotlin.math.abs

@OptIn(ExperimentalSnapperApi::class)
@Composable
fun ReelsScreen(
    lifecycleOwner: LifecycleOwner = LocalLifecycleOwner.current,
    cache: Cache,
    viewModel: ReelsViewModel = hiltViewModel()
) {

    val videos by viewModel.dataItems.collectAsStateWithLifecycle()

    val context = LocalContext.current
    val mediaSources = videos.map {
        val cacheDataSource = CacheDataSource.Factory()
            .setCache(cache)
            .setUpstreamDataSourceFactory(
                DefaultHttpDataSource.Factory()
                    .setAllowCrossProtocolRedirects(true)
            )
            .setFlags(CacheDataSource.FLAG_IGNORE_CACHE_ON_ERROR)
        ProgressiveMediaSource.Factory(cacheDataSource)
            .createMediaSource(
                MediaItem.fromUri(it.url)
            )
    }
    val player = remember(context) {
        ExoPlayer.Builder(context)
            .setUseLazyPreparation(false)
            .build()
            .apply {
                addMediaSources(mediaSources)
                prepare()
                repeatMode = Player.REPEAT_MODE_ONE
                playWhenReady = true
                videoScalingMode = C.VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING
                seekTo(0, 100L)
            }
    }

    DisposableEffect(lifecycleOwner) {
        val observer = LifecycleEventObserver { _, event ->
            when (event) {
                Lifecycle.Event.ON_PAUSE -> player.playWhenReady = false
                Lifecycle.Event.ON_RESUME -> player.playWhenReady = true
                Lifecycle.Event.ON_DESTROY -> {
                    player.stop()
                    player.release()
                }

                else -> {}
            }
        }
        lifecycleOwner.lifecycle.addObserver(observer)
        onDispose {
            lifecycleOwner.lifecycle.removeObserver(observer)
        }
    }

    val listState = rememberLazyListState()
    val currentItem by remember {
        derivedStateOf {
            determineCurrentlyPlayingItem(listState)
        }
    }

    LaunchedEffect(currentItem) {
        if (currentItem != null && player.currentMediaItemIndex != currentItem) {
            player.apply {
                seekTo(currentItem!!, 100L)
                playWhenReady = true
            }
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            state = listState,
            flingBehavior = rememberSnapperFlingBehavior(
                lazyListState = listState,
                snapOffsetForItem = SnapOffsets.Center,
            )
        ) {
            items(
                items = videos,
                key = { it.url }
            ) {
                Video(
                    modifier = Modifier.fillParentMaxSize(),
                    player = player,
                    video = it,
                    index = videos.indexOf(it)
                )
            }
        }

        Row(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Reels",
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground,
                fontSize = 22.sp,
                fontFamily = FontFamily.SansSerif
            )

            Icon(
                imageVector = cameraVector(), contentDescription = "",
                modifier = Modifier
                    .padding(8.dp)
                    .size(25.dp),
            )
        }
    }
}

private fun determineCurrentlyPlayingItem(listState: LazyListState): Int? {
    val layoutInfo = listState.layoutInfo
    val midPoint = (layoutInfo.viewportStartOffset + layoutInfo.viewportEndOffset) / 2
    return layoutInfo.visibleItemsInfo
        .sortedBy { abs((it.offset + it.size / 2) - midPoint) }
        .map { it.index }
        .firstOrNull()
}
