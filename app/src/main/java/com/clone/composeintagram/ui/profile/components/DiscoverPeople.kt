package com.clone.composeintagram.ui.profile.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Clear
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.clone.composeintagram.ui.profile.ProfileViewModel

@Composable
fun RowDiscoverPeople(
    modifier: Modifier = Modifier,
    viewModel: ProfileViewModel
) {
    val items by viewModel.dataItems.collectAsStateWithLifecycle()
    LazyRow(contentPadding = PaddingValues(8.dp)) {
        itemsIndexed(items) { id, item ->
            DiscoverPeopleItem(name = item.name, followed = item.followed) {
                viewModel.removeItemFollowed(id)
            }
        }
    }
}

@Composable
fun DiscoverPeopleItem(
    modifier: Modifier = Modifier,
    name: String,
    followed: String,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .padding(2.dp)
            .width(160.dp)
            .height(220.dp)
            .border(
                width = 0.8.dp,
                color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.1f),
                shape = RoundedCornerShape(4.dp)
            )
    ) {
        Column(
            modifier = modifier
                .padding(horizontal = 12.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data("https://picsum.photos/200")
                    .crossfade(true)
                    .build(),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = modifier
                    .size(75.dp)
                    .clip(CircleShape)
            )
            Column(
                modifier = modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = name)
                Text(
                    text = "Followed by",
                    fontSize = 12.sp,
                    letterSpacing = 0.sp,
                    color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.4f)
                )
                Text(
                    text = followed,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    fontSize = 12.sp,
                    letterSpacing = 0.sp,
                    color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.4f)
                )
            }
            OutlinedButton(
                onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(
                        0xFF1da1f2
                    ),
                ),
                border = BorderStroke(width = 1.dp, color = Color.Transparent),
                shape = RoundedCornerShape(12.dp),
                modifier = modifier.size(
                    width = 100.dp,
                    height = 35.dp
                ),
            ) {
                Text(
                    text = "Follow",
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontSize = 14.sp
                )
            }
        }
        Box(
            modifier = modifier
                .align(Alignment.TopEnd)
                .padding(6.dp)
                .size(30.dp)
        ) {
            IconButton(onClick = onClick) {
                Icon(
                    imageVector = Icons.Outlined.Clear,
                    contentDescription = "",
                    modifier = modifier.size(20.dp),
                    tint = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.7f)
                )
            }
        }
    }
}