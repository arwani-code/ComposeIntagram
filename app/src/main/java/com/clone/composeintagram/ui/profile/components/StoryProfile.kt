package com.clone.composeintagram.ui.profile.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material.icons.outlined.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.clone.composeintagram.ui.utils.SizeScreen

@Composable
fun StoryProfile(
    modifier: Modifier = Modifier,
    screen: SizeScreen = SizeScreen()
) {
    var hideStories by remember {
        mutableStateOf(true)
    }
    Column(
        modifier = modifier
            .height(screen.height().dp)
            .padding(horizontal = 12.dp, vertical = 14.dp)
            .fillMaxWidth()
    ) {
        Row(
            modifier = modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Story highlights", fontSize = 14.sp, fontWeight = FontWeight.Bold)
            if (hideStories){
                Icon(
                    imageVector = Icons.Outlined.KeyboardArrowUp,
                    contentDescription = "",
                    modifier
                        .size(20.dp)
                        .clickable { hideStories = !hideStories }
                )
            }else{
                Icon(
                    imageVector = Icons.Outlined.KeyboardArrowDown,
                    contentDescription = "",
                    modifier
                        .size(20.dp)
                        .clickable { hideStories = !hideStories }
                )
            }
        }
        Text(
            text = "Keep your favorite stories on your profile",
            fontSize = 14.sp,
            color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.9f),
            letterSpacing = 0.sp
        )
        AnimatedVisibility(visible = hideStories) {
            LazyRow(modifier = modifier.padding(vertical = 12.dp), ) {
                item {
                    Column(
                        modifier = modifier,
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Box(
                            modifier = modifier
                                .border(
                                    width = 1.dp,
                                    color = MaterialTheme.colorScheme.onBackground,
                                    shape = CircleShape
                                )
                                .size(65.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Outlined.Add,
                                contentDescription = "",
                                modifier = modifier.size(30.dp)
                            )
                        }
                        Text(text = "New", fontSize = 12.sp)
                    }
                }
                items(6) {
                    Box(
                        modifier = modifier
                            .padding(start = 8.dp)
                            .clip(CircleShape)
                            .background(MaterialTheme.colorScheme.onBackground.copy(0.1f))
                            .size(65.dp)
                    )
                }
            }
        }
    }
}