package com.clone.composeintagram.navigation

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.rememberSplineBasedDecay
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.clone.composeintagram.ui.components.TopInstagramBar
import com.clone.composeintagram.ui.home.HomeScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InstagramNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    lazyListState: LazyListState = rememberLazyListState(),
    scrollBehavior: TopAppBarScrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(
        state = rememberTopAppBarState()
    )
) {


    Scaffold(
        topBar = {
            TopInstagramBar(scrollBehavior = scrollBehavior)
        },
        modifier = modifier
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "Home",
            modifier = modifier.padding(innerPadding)
        ) {
            composable("Home") {
                HomeScreen(
                    lazyListState = lazyListState,
                    nestedScrollConnection = scrollBehavior.nestedScrollConnection
                )
            }
        }
    }
}