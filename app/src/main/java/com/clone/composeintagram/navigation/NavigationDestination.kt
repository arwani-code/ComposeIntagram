package com.clone.composeintagram.navigation

import androidx.compose.ui.graphics.vector.ImageVector

interface NavigationDestination {
    val icon: ImageVector
    val route: String
}

