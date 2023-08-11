package com.clone.composeintagram.ui.components

import androidx.compose.animation.core.DecayAnimationSpec
import androidx.compose.animation.rememberSplineBasedDecay
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.captionBarIgnoringVisibility
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imeNestedScroll
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Velocity
import androidx.compose.ui.unit.dp
import com.clone.composeintagram.base.arrowDown
import com.clone.composeintagram.base.instagramVector
import com.clone.composeintagram.base.loveVector
import com.clone.composeintagram.base.messengerVector
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopInstagramBar(
    modifier: Modifier = Modifier,
    scrollBehavior: TopAppBarScrollBehavior
) {

    val heightOffsetLimit = with(LocalDensity.current) { 0.dp.toPx() }
    SideEffect {
        if (scrollBehavior.state.heightOffsetLimit != heightOffsetLimit) {
            scrollBehavior.state.heightOffsetLimit = heightOffsetLimit
        }
    }
    val heightPx = LocalDensity.current.run { 44.dp.toPx() + scrollBehavior.state.heightOffset }
    val height = LocalDensity.current.run { heightPx.toDp() }
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
        colors = TopAppBarDefaults.smallTopAppBarColors(
            scrolledContainerColor = MaterialTheme.colorScheme.background,
        ),
        modifier = modifier.height(height)
    )
}