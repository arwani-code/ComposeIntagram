package com.clone.composeintagram.ui.home.components

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.clone.composeintagram.base.addRoundedVector
import com.clone.composeintagram.data.DataModel
import java.util.Locale

@Composable
fun RowIgStatus(
    modifier: Modifier = Modifier,
    igStatus: List<DataModel>,
    statusIgBorder: List<Color>,
    context: Context = LocalContext.current
) {
    Column {
        LazyRow(
            contentPadding = PaddingValues(start = 12.dp, end = 12.dp, bottom = 12.dp),
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            item {
                Column(
                    modifier = modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(modifier = modifier, contentAlignment = Alignment.BottomEnd) {
                        Box(
                            modifier = modifier
                                .padding(2.dp)
                                .clip(CircleShape)
                                .size(80.dp),
                        ) {
                            AsyncImage(
                                model = ImageRequest.Builder(context)
                                    .data("https://i.postimg.cc/kX8xCR06/351251814-178642991799472-3134276109914643848-n.jpg")
                                    .crossfade(true)
                                    .build(),
                                contentDescription = null,
                                contentScale = ContentScale.FillBounds,
                                modifier = modifier.fillMaxSize()
                            )
                        }
                        Box(
                            modifier
                                .clip(CircleShape)
                                .size(25.dp)
                                .background(MaterialTheme.colorScheme.onPrimary)
                        ) {
                            Image(
                                imageVector = addRoundedVector(),
                                contentDescription = "icon",
                                modifier = modifier
                                    .padding(1.5.dp)
                                    .fillMaxSize()
                            )
                        }
                    }
                    Spacer(modifier = modifier.height(8.dp))
                    Text(
                        text = "Your Story",
                        fontSize = 12.sp,
                        maxLines = 1,
                        letterSpacing = 0.sp,
                    )
                }
            }
            items(igStatus, key = { it.statusImage }) {
                Column(
                    modifier = modifier,
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        modifier = modifier
                            .clip(CircleShape)
                            .background(
                                brush = Brush.linearGradient(statusIgBorder),
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Box(
                            modifier = modifier
                                .padding(2.dp)
                                .border(
                                    width = 2.dp,
                                    color = MaterialTheme.colorScheme.onPrimary,
                                    shape = CircleShape
                                )
                                .size(80.dp)
                                .clip(CircleShape),
                            contentAlignment = Alignment.Center
                        ) {
                            AsyncImage(
                                model = ImageRequest.Builder(context)
                                    .data(it.statusImage)
                                    .crossfade(true)
                                    .build(),
                                contentDescription = null,
                                contentScale = ContentScale.FillBounds,
                                modifier = modifier.fillMaxSize()
                            )
                        }
                    }
                    Spacer(modifier = modifier.height(8.dp))
                    Text(
                        text = it.name.lowercase(Locale.ENGLISH),
                        fontSize = 12.sp,
                        maxLines = 1,
                        modifier = modifier.width(60.dp),
                        letterSpacing = 0.sp,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
        }
        Divider(thickness = 0.3.dp)
    }
}