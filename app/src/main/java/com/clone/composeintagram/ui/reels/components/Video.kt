package com.clone.composeintagram.ui.reels.components

import android.util.Log
import android.view.LayoutInflater
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.clone.composeintagram.R
import com.clone.composeintagram.data.Video
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout
import com.google.android.exoplayer2.ui.StyledPlayerView

@Composable
fun Video(
    modifier: Modifier = Modifier,
    player: ExoPlayer,
    video: Video,
    index: Int,
) {
    val state = rememberPlaybackState(player, index)
    val context = LocalContext.current
    val playerView = remember {
        LayoutInflater
            .from(context)
            .inflate(R.layout.video_player_view, null, false) as StyledPlayerView
    }

    DisposableEffect(state) {
        onDispose {
            if (state.currentMediaItem != MediaItem.EMPTY && state.currentMediaItem != player.getMediaItemAt(
                    index
                )
            ) {
                playerView.player = null
                Log.v("PlayerView", "$index: Detach Player From PlayerView")
            }
        }
    }

    LaunchedEffect(state) {
        if (state.isReady && playerView.player != player && player.currentMediaItemIndex == index) {
            playerView.player = player
            Log.v("PlayerView", "$index: Attach Player To Player View")
        }
    }

    Surface(
        modifier = modifier,
        contentColor = Color.White,
        color = Color.Black,
    ) {
        Box {
            AndroidView(
                modifier = Modifier.matchParentSize(),
                factory = {
                    playerView.apply {
                        resizeMode = AspectRatioFrameLayout.RESIZE_MODE_ZOOM
                    }
                },
            )

            if (!state.firstFrameRendered) {
                Thumbnail(
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(16f / 9f)
                        .align(Alignment.Center),
                    url = video.thumbnail,
                )
            }

            if (!state.isReady) {
                LoadingIndicator(
                    modifier = Modifier.align(Alignment.Center)
                )
            }

            VideoActions(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(8.dp),
                isFavorite = video.isFavorite,
            )
        }
    }
}