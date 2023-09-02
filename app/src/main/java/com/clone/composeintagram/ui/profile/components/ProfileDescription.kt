package com.clone.composeintagram.ui.profile.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.clone.composeintagram.base.threadsLogo

@Composable
fun ProfileDescription(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data("https://i.postimg.cc/kX8xCR06/351251814-178642991799472-3134276109914643848-n.jpg")
                .crossfade(true)
                .build(),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = modifier
                .size(75.dp)
                .clip(CircleShape)
        )
        TopProfileSection(totalCount = "0", title = "Posts")
        TopProfileSection(totalCount = "955k", title = "Followers")
        TopProfileSection(totalCount = "0", title = "Following")
    }
}


@Composable
fun ThreadsAccount(modifier: Modifier = Modifier) {
    Text(
        text = "Jhon Doe",
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        modifier = modifier.padding(vertical = 6.dp, horizontal = 12.dp)
    )
    Box(
        modifier = modifier
            .padding(bottom = 10.dp, start = 10.dp)
            .clip(CircleShape)
            .background(Color.Gray.copy(0.3f))
    ) {
        Row(
            modifier = modifier.padding(6.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                imageVector = threadsLogo(),
                contentDescription = "",
                modifier = modifier.padding(end = 5.dp)
            )
            Text(
                text = "123,450,203",
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}