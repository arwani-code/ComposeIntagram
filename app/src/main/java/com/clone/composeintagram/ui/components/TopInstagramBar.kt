package com.clone.composeintagram.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import com.clone.composeintagram.base.arrowDown
import com.clone.composeintagram.base.instagramVector
import com.clone.composeintagram.base.loveVector
import com.clone.composeintagram.base.messengerVector

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopInstagramBar(
    modifier: Modifier = Modifier,
    scrollBehavior: TopAppBarScrollBehavior
) {

//    val heightOffsetLimit = with(LocalDensity.current) { 54.dp.toPx() }
//    SideEffect {
//        if (scrollBehavior.state.heightOffsetLimit != heightOffsetLimit) {
//            scrollBehavior.state.heightOffsetLimit = heightOffsetLimit
//        }
//    }
//    val heightPx = LocalDensity.current.run { 54.dp.toPx() + scrollBehavior.state.heightOffset }
//    val height = LocalDensity.current.run { heightPx.toDp() }
    TopAppBar(
        title = {
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .height(50.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    modifier = modifier.graphicsLayer { translationX = -80f },
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {
                    Icon(
                        imageVector = instagramVector(),
                        contentDescription = "icon",
                        modifier = modifier
                    )
                    Spacer(modifier = modifier.padding(end = 8.dp))
                    Icon(
                        imageVector = arrowDown(),
                        contentDescription = "icon",
                        modifier = modifier
                    )
                }
                Row(
                    modifier = modifier.padding(end = 18.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = loveVector(),
                        contentDescription = "icon",
                        modifier = modifier
                    )
                    Spacer(modifier = modifier.padding(end = 24.dp))
                    Icon(
                        imageVector = messengerVector(),
                        contentDescription = "icon",
                        modifier = modifier
                    )
                }
            }
        },
        scrollBehavior = scrollBehavior,
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            scrolledContainerColor = MaterialTheme.colorScheme.background,
        ),
    )
}