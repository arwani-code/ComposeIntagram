package com.clone.composeintagram.ui.reels.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.MarqueeSpacing
import androidx.compose.foundation.background
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.clone.composeintagram.base.audioVector
import com.clone.composeintagram.base.vectorLocation

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun VideoDescription(modifier: Modifier = Modifier) {
    var following by remember {
        mutableStateOf(false)
    }
    Column(
        modifier = modifier
            .padding(start = 8.dp)
    ) {
        Row(
            modifier = modifier,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data("https://picsum.photos/200")
                    .crossfade(true)
                    .build(),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = modifier
                    .size(35.dp)
                    .clip(CircleShape)
            )
            Text(
                text = "Jhon Doe",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                modifier = modifier.padding(horizontal = 8.dp)
            )
            OutlinedButton(
                onClick = { following = !following },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent
                ),
                border = BorderStroke(width = 1.dp, color = Color.White),
                shape = RoundedCornerShape(12.dp),
                contentPadding = PaddingValues(horizontal = 6.dp, vertical = 2.dp),
                modifier = modifier
                    .height(30.dp)
                    .width(75.dp)
            ) {
                Text(
                    text = if (following) "Following" else "Follow",
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontSize = 14.sp
                )
            }
        }
        Text(
            text = "Hello World", color = Color.White,
            fontSize = 14.sp,
            modifier = modifier.padding(top = 18.dp, bottom = 12.dp)
        )
        Row(
            modifier = modifier,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = modifier
                    .padding(bottom = 12.dp)
                    .clip(CircleShape)
                    .background(Color.Transparent.copy(0.3f))
            ) {
                Row(
                    modifier = modifier.padding(6.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        imageVector = audioVector(),
                        contentDescription = "",
                        modifier = modifier.padding(end = 10.dp)
                    )
                    Row(modifier = modifier.width(120.dp)) {
                        Text(
                            text = "Music Factory · Style (Speed Up) (Remix)",
                            modifier = Modifier.basicMarquee(
                                iterations = Int.MAX_VALUE,
                                spacing = MarqueeSpacing(0.dp),
                            ),
                            fontSize = 12.sp
                        )
                    }
                }
            }
            Box(
                modifier = modifier
                    .padding(bottom = 12.dp, start = 12.dp)
                    .clip(CircleShape)
                    .background(Color.Transparent.copy(0.3f))
            ) {
                Row(
                    modifier = modifier.padding(6.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        imageVector = vectorLocation(),
                        contentDescription = "",
                        modifier = modifier.padding(end = 5.dp)
                    )
                    Text(
                        text = "Jakarta",
                        fontSize = 12.sp
                    )
                }
            }
        }
    }
}
