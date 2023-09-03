package com.clone.composeintagram.ui.search

import android.content.Context
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.clone.composeintagram.ui.utils.SizeScreen

@Composable
fun SearchScreen(
    modifier: Modifier = Modifier,
    viewModel: SearchViewModel = hiltViewModel(),
    context: Context = LocalContext.current,
    nestedScrollConnection: NestedScrollConnection,
    sizeScreen: SizeScreen = SizeScreen()
) {
    val dataItems by viewModel.dataItems.collectAsStateWithLifecycle()
    Box(modifier = modifier.fillMaxSize()) {
        LazyVerticalStaggeredGrid(
            columns = StaggeredGridCells.Fixed(3),
            modifier = modifier
                .fillMaxSize()
                .nestedScroll(nestedScrollConnection)
        ) {
            itemsIndexed(dataItems) { index, item ->
                Box(
                    modifier = modifier
                        .height(if (item.canLargeImage) (sizeScreen.height() / 3).dp else (sizeScreen.height() / 6).dp)
                        .padding(1.dp)
                ) {
                    AsyncImage(
                        model = ImageRequest.Builder(context)
                            .data(item.postImage)
                            .crossfade(true)
                            .build(),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = modifier.fillMaxSize()
                    )
                }
            }
        }
    }
}