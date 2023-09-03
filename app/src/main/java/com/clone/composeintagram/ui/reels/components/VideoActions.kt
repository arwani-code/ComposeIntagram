package com.clone.composeintagram.ui.reels.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.clone.composeintagram.base.commentVector
import com.clone.composeintagram.base.loveVector
import com.clone.composeintagram.base.moreVector
import com.clone.composeintagram.base.rememberShareVector


@Composable
fun VideoActions(
    modifier: Modifier = Modifier,
    isFavorite: Boolean
) {
    var favorite by remember {
        mutableStateOf(isFavorite)
    }
    Column(
        modifier = modifier.padding(end = 5.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ItemAction(
            title = "250k",
            image = loveVector(favorite),
            onClick = { favorite = !favorite },
            favorite = favorite
        )
        ItemAction(title = "234k", image = commentVector())
        ItemAction(title = "344k", image = rememberShareVector())
        Image(
            imageVector = moreVector(), contentDescription = "",
            colorFilter = ColorFilter.tint(color = Color.White),
            modifier = modifier.padding(vertical = 10.dp)
        )
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data("https://picsum.photos/200")
                .crossfade(true)
                .build(),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = modifier
                .border(color = Color.White, width = 1.dp, shape = RoundedCornerShape(4.dp))
                .size(25.dp)
                .clip(RoundedCornerShape(4.dp))
        )
    }
}

@Composable
private fun ItemAction(
    modifier: Modifier = Modifier,
    title: String,
    image: ImageVector,
    onClick: () -> Unit = {},
    favorite: Boolean = false
) {
    Column(
        modifier = modifier
            .padding(vertical = 8.dp)
            .height(50.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            imageVector = image,
            contentDescription = "",
            modifier = modifier.clickable { onClick() },
            colorFilter = ColorFilter.tint(color = if (favorite) Color.Red else Color.White)
        )
        Text(text = title, color = Color.White, fontSize = 12.sp)
    }
}