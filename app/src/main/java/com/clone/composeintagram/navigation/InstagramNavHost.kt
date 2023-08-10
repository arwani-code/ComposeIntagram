package com.clone.composeintagram.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
    navController: NavHostController = rememberNavController()
) {

    Scaffold(
        topBar = {
            TopInstagramBar()
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "Home",
            modifier = modifier.padding(innerPadding)
        ) {
            composable("Home"){
                HomeScreen()
            }
        }
    }
}