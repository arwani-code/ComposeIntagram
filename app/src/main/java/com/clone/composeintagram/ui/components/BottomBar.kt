package com.clone.composeintagram.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.clone.composeintagram.R
import com.clone.composeintagram.base.bottomIconSearch
import com.clone.composeintagram.base.homeIcon
import com.clone.composeintagram.base.reelsBottomIcon
import com.clone.composeintagram.base.rememberVectorSearch
import com.clone.composeintagram.ui.utils.SizeScreen
import com.clone.composeintagram.ui.utils.navigateSingleTopTo

@Composable
fun BottomBar(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    currentScreen: String?,
) {
    NavigationBar(
        modifier = modifier
            .height(50.dp)
            .drawBehind {
                val borderSize = 1.dp.toPx()
                drawLine(
                    color = if (currentScreen != "Reels") Color.LightGray else Color.Black,
                    start = Offset(0f, 0f),
                    end = Offset(size.width, 0f),
                    strokeWidth = borderSize
                )
            },
        containerColor = if (currentScreen != "Reels") MaterialTheme.colorScheme.background.copy(
            alpha = 0.3f
        ) else Color.Black,
    ) {
        val items = listOf(
            BottomBarItems(
                icon = homeIcon(currentScreen == "Home"),
                screen = "Home"
            ),
            BottomBarItems(
                icon = bottomIconSearch(currentScreen == "Search"),
                screen = "Search"
            ),
            BottomBarItems(
                icon = reelsBottomIcon(currentScreen == "Reels"),
                screen = "Reels"
            ),
            BottomBarItems(
                icon = null,
                screen = "Profile"
            ),
        )

        items.map { item ->
           if (item.icon != null){
               NavigationBarItem(
                   selected = currentScreen == item.screen,
                   onClick = { navController.navigateSingleTopTo(item.screen) },
                   icon = {
                       Icon(imageVector = item.icon, contentDescription = item.screen)
                   },
                   colors = NavigationBarItemDefaults.colors(
                       indicatorColor = MaterialTheme.colorScheme.background.copy(alpha = 0.3f)
                   ),
               )
           }else{
               NavigationBarItem(
                   selected = currentScreen == item.screen,
                   onClick = { navController.navigateSingleTopTo(item.screen) },
                   icon = {
                       AsyncImage(
                           model = ImageRequest.Builder(LocalContext.current)
                               .data("https://i.postimg.cc/kX8xCR06/351251814-178642991799472-3134276109914643848-n.jpg")
                               .crossfade(true)
                               .build(),
                           contentDescription = null,
                           contentScale = ContentScale.Crop,
                           modifier = modifier
                               .size(30.dp)
                               .clip(CircleShape)
                       )
                   },
                   colors = NavigationBarItemDefaults.colors(
                       indicatorColor = MaterialTheme.colorScheme.background.copy(alpha = 0.3f)
                   ),
               )
           }
        }
    }
}

data class BottomBarItems(
    val icon: ImageVector?,
    val screen: String
)