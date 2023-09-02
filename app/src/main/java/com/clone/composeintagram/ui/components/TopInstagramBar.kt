package com.clone.composeintagram.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.clone.composeintagram.base.addPostVector
import com.clone.composeintagram.base.arrowDown
import com.clone.composeintagram.base.instagramVector
import com.clone.composeintagram.base.loveVector
import com.clone.composeintagram.base.messengerVector
import com.clone.composeintagram.base.rememberVectorMenu
import com.clone.composeintagram.base.rememberVectorSearch
import com.clone.composeintagram.base.verifiedVector
import com.clone.composeintagram.ui.utils.SizeScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopInstagramBar(
    modifier: Modifier = Modifier,
    scrollBehavior: TopAppBarScrollBehavior,
    currentRoute: String?,
    size: SizeScreen = SizeScreen()
) {
    if (currentRoute != "Reels") {
        TopAppBar(
            title = {
                when (currentRoute) {
                    "Home" -> HomeTopAppBar(modifier = modifier)
                    "Search" -> SearchTopAppBar(modifier = modifier, size = (size.width() / 20).dp)
                    "Profile" -> ProfileTopAppBar(modifier = modifier)
                }
            },
            scrollBehavior = scrollBehavior,
            colors = TopAppBarDefaults.mediumTopAppBarColors(
                scrolledContainerColor = MaterialTheme.colorScheme.background,
            ),
        )
    }
}

@Composable
private fun HomeTopAppBar(modifier: Modifier) {
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
}

@Composable
private fun SearchTopAppBar(modifier: Modifier, size: Dp) {
    Box(
        modifier = modifier
            .padding(end = size)
            .fillMaxWidth()
            .heightIn(max = 38.dp)
            .background(
                MaterialTheme.colorScheme.inverseOnSurface,
                RoundedCornerShape(percent = 20)
            )
    ) {
        BasicTextField(
            value = "",
            onValueChange = { },
            enabled = false,
            decorationBox = { innerTextField ->
                Row(
                    Modifier
                        .fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {
                    Icon(
                        rememberVectorSearch(),
                        contentDescription = "",
                        tint = MaterialTheme.colorScheme.onBackground,
                        modifier = modifier
                            .padding(horizontal = 12.dp)
                            .size(20.dp)
                    )
                    Text(
                        text = "Search",
                        fontSize = 16.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    innerTextField()
                }
            },
        )
    }
}

@Composable
private fun ProfileTopAppBar(modifier: Modifier) {
    Box(modifier = modifier) {
        Row(
            modifier = modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = modifier,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Jhon Doe",
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(modifier = modifier.width(8.dp))
                Image(imageVector = verifiedVector(), contentDescription = "")
            }
            Row(
                modifier = modifier.padding(horizontal = 14.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    imageVector = addPostVector(),
                    contentDescription = "",
                    colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onBackground)
                )
                Spacer(modifier = modifier.width(16.dp))
                Image(
                    imageVector = rememberVectorMenu(),
                    contentDescription = "",
                    colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onBackground)
                )
            }
        }
    }
}