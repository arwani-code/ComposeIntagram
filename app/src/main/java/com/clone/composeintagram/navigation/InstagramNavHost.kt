package com.clone.composeintagram.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.clone.composeintagram.ui.components.TopInstagramBar
import com.clone.composeintagram.ui.home.HomeScreen
import com.clone.composeintagram.ui.search.SearchScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InstagramNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    scrollBehavior: TopAppBarScrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(
        state = rememberTopAppBarState()
    ),
) {

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold(
        topBar = {
            TopInstagramBar(scrollBehavior = scrollBehavior, currentRoute = currentRoute)
        },
        bottomBar = {}
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "Search",
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
        }
    }
}


fun NavHostController.navigateSingleTopTo(route: String) =
    this.navigate(route) {
        popUpTo(
            this@navigateSingleTopTo.graph.findStartDestination().id
        ) {
            saveState = true
        }
        launchSingleTop = true
        restoreState = true
    }

//
//@Composable
//private fun BottomBar(
//    navController: NavHostController,
//    modifier: Modifier = Modifier
//) {
//    NavigationBar(
//        modifier = modifier,
//    ) {
//        val navigationItems = listOf(
//            NavigationItem(
//                title = stringResource(R.string.menu_home),
//                icon = Icons.Default.Home,
//                screen = Screen.Home
//            ),
//            NavigationItem(
//                title = stringResource(R.string.menu_cart),
//                icon = Icons.Default.ShoppingCart,
//                screen = Screen.Cart
//            ),
//            NavigationItem(
//                title = stringResource(R.string.menu_profile),
//                icon = Icons.Default.AccountCircle,
//                screen = Screen.Profile
//            ),
//        )
//        navigationItems.map { item ->
//            NavigationBarItem(
//                icon = {
//                    Icon(
//                        imageVector = item.icon,
//                        contentDescription = item.title
//                    )
//                },
//                label = { Text(item.title) },
////                selected = false,
//                selected = currentRoute == item.screen.route,
//                onClick = {
//                    navController.navigate(item.screen.route) {
//                        popUpTo(navController.graph.findStartDestination().id) {
//                            saveState = true
//                        }
//                        restoreState = true
//                        launchSingleTop = true
//                    }
//                }
//            )
//        }
//    }
//}