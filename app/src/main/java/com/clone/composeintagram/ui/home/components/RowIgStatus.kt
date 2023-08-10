package com.clone.composeintagram.ui.home.components

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
    statusIgBorder: List<Color>
) {
    val context = LocalContext.current
    LazyRow(
        contentPadding = PaddingValues(horizontal = 12.dp),
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        item {
            Column(
                modifier = modifier,
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
                                .data("https://scontent.cdninstagram.com/v/t51.2885-19/314827144_688732645901903_7513758145817461481_n.jpg?stp=dst-jpg_s150x150&_nc_ht=scontent.cdninstagram.com&_nc_cat=111&_nc_ohc=C5De3MJG0VsAX8RqXb9&edm=APs17CUBAAAA&ccb=7-5&oh=00_AfASoNr5RxMTcQlBJ8OfOPDtWfEaYGakfdFFXHulNN4WOg&oe=64D66580&_nc_sid=10d13b")
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
        items(igStatus, key = { it.image }) {
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
                                .data(it.image)
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
}