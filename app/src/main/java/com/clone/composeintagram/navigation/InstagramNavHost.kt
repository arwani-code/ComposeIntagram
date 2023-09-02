package com.clone.composeintagram.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.clone.composeintagram.ui.components.BottomBar
import com.clone.composeintagram.ui.components.TopInstagramBar
import com.clone.composeintagram.ui.home.HomeScreen
import com.clone.composeintagram.ui.profile.ProfileScreen
import com.clone.composeintagram.ui.reels.ReelsScreen
import com.clone.composeintagram.ui.search.SearchScreen
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.google.android.exoplayer2.upstream.cache.Cache
import kotlinx.coroutines.delay

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InstagramNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    scrollBehavior: TopAppBarScrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(
        state = rememberTopAppBarState()
    ),
    cache: Cache,
    currentRoute: String?,
) {
    Scaffold(
        topBar = {
            TopInstagramBar(scrollBehavior = scrollBehavior, currentRoute = currentRoute)
        },
        bottomBar = {
            BottomBar(navController = navController, currentScreen = currentRoute)
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "Home",
            modifier = modifier.padding(innerPadding)
        ) {
            composable("Home") {
                HomeScreen(
                    nestedScrollConnection = scrollBehavior.nestedScrollConnection,
                )
            }
            composable("Search") {
                SearchScreen(
                    nestedScrollConnection = scrollBehavior.nestedScrollConnection,
                )
            }
            composable("Reels") {
                ReelsScreen(cache = cache)
            }
            composable("Profile") {
                ProfileScreen()
            }
        }
    }
}
