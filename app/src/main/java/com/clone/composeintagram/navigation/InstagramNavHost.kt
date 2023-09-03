package com.clone.composeintagram.navigation

import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.clone.composeintagram.ui.components.BottomBar
import com.clone.composeintagram.ui.components.TopInstagramBar
import com.clone.composeintagram.ui.home.HomeScreen
import com.clone.composeintagram.ui.profile.ProfileScreen
import com.clone.composeintagram.ui.reels.ReelsScreen
import com.clone.composeintagram.ui.search.SearchScreen
import com.google.android.exoplayer2.upstream.cache.Cache

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InstagramNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    cache: Cache,
    currentRoute: String?,
    homeScrollBehavior: TopAppBarScrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(),
    searchScrollBehavior: TopAppBarScrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
) {
    Scaffold(
        topBar = {
            TopInstagramBar(
                searchScrollBehavior = searchScrollBehavior,
                homeScrollBehavior = homeScrollBehavior,
                currentRoute = currentRoute
            )
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
                    nestedScrollConnection = homeScrollBehavior.nestedScrollConnection,
                )
            }
            composable("Search") {
                SearchScreen(
                    nestedScrollConnection = searchScrollBehavior.nestedScrollConnection,
                )
            }
            composable("Reels") {
                ReelsScreen(cache = cache)
            }
            composable("Profile") {
                ProfileScreen()
            }
            composable("Posts") {
                val multiplePhotoPickerLauncher = rememberLauncherForActivityResult(
                    contract = ActivityResultContracts.PickMultipleVisualMedia(),
                    onResult = { }
                )
                LaunchedEffect(key1 = Unit, block = {
                    multiplePhotoPickerLauncher.launch(
                        PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageOnly)
                    )
                })
            }
        }
    }
}
