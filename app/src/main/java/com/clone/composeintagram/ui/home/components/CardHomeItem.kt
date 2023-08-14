package com.clone.composeintagram.ui.home.components

import android.content.Context
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.clone.composeintagram.base.commentVector
import com.clone.composeintagram.base.loveVector
import com.clone.composeintagram.base.postCommentVector
import com.clone.composeintagram.base.saveVector
import com.clone.composeintagram.base.verifiedVector
import com.clone.composeintagram.data.DataModel
import com.clone.composeintagram.ui.theme.red500

@Composable
fun CardHomeItem(
    modifier: Modifier = Modifier,
    data: DataModel,
    addComment: (Boolean) -> Unit
) {
    Column(
        modifier = modifier
            .padding(vertical = 10.dp)
            .fillMaxWidth()
    ) {
        RowTopView(
            name = data.name,
            peopleImage = data.peopleImage
        )
        CardImageView(imgPostUrl = data.postImage, addComment = addComment)
        CommentSection(
            likes = data.likes,
            peopleImage = data.peopleImage,
            name = data.name,
            contentDesc = data.contentDescription,
            timeMoments = data.moments,
            addComment = addComment
        )
    }
}

@Composable
private fun RowTopView(
    modifier: Modifier = Modifier,
    context: Context = LocalContext.current,
    name: String,
    peopleImage: String
) {
    val colorList = listOf(
        Color(0xFF962fbf),
        Color(0xFFd62976),
        Color(0xFFfa7e1e),
        Color(0xFFfeda75),
    )
    Row(
        modifier = modifier
            .padding(start = 12.dp, end = 16.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            modifier = modifier,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = modifier
                    .clip(CircleShape)
                    .background(
                        brush = Brush.linearGradient(colorList),
                    ),
            ) {
                Box(
                    modifier = modifier
                        .padding(1.dp)
                        .size(30.dp)
                        .clip(CircleShape)
                        .border(
                            width = 1.dp,
                            color = MaterialTheme.colorScheme.onPrimary,
                            shape = CircleShape
                        )
                ) {
                    AsyncImage(
                        model = ImageRequest.Builder(context)
                            .data(peopleImage)
                            .crossfade(true)
                            .build(),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = modifier
                            .fillMaxSize()
                    )
                }
            }
            Text(
                text = name,
                modifier = modifier.padding(horizontal = 8.dp),
                fontSize = 14.sp,
                letterSpacing = 0.sp,
                fontWeight = FontWeight.W500
            )
            Image(imageVector = verifiedVector(), contentDescription = "", modifier = modifier)
        }
        Image(
            imageVector = Icons.Sharp.MoreVert,
            contentDescription = "",
            modifier = modifier.width(20.dp),
            colorFilter = ColorFilter.tint(
                color = MaterialTheme.colorScheme.onBackground
            )
        )
    }
}

@Composable
private fun CardImageView(
    modifier: Modifier = Modifier,
    context: Context = LocalContext.current,
    imgPostUrl: String,
    addComment: (Boolean) -> Unit
) {
    var contentSave by rememberSaveable {
        mutableStateOf(false)
    }
    var contentFavorite by rememberSaveable {
        mutableStateOf(false)
    }
    Column(
        modifier = modifier
            .padding(top = 8.dp)
            .fillMaxWidth()
    ) {
        AsyncImage(
            model = ImageRequest.Builder(context)
                .data(data = imgPostUrl)
                .crossfade(true)
                .build(),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = modifier
                .fillMaxWidth()
                .height(500.dp)
        )
        Row(
            modifier = modifier
                .padding(horizontal = 16.dp, vertical = 12.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = modifier,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    imageVector = loveVector(contentFavorite = contentFavorite),
                    contentDescription = "",
                    modifier = modifier.clickable { contentFavorite = !contentFavorite },
                    tint = if (contentFavorite) red500 else MaterialTheme.colorScheme.onBackground
                )
                Icon(
                    imageVector = commentVector(),
                    contentDescription = "",
                    modifier = modifier
                        .padding(horizontal = 20.dp)
                        .clickable { addComment(true) }
                )
                Icon(imageVector = postCommentVector(), contentDescription = "")
            }
            Icon(
                imageVector = saveVector(contentSave),
                contentDescription = "",
                modifier = modifier.clickable { contentSave = !contentSave })
        }
    }
}

@Composable
private fun CommentSection(
    modifier: Modifier = Modifier,
    context: Context = LocalContext.current,
    likes: String,
    name: String,
    contentDesc: String,
    peopleImage: String,
    timeMoments: String,
    addComment: (Boolean) -> Unit
) {
    var fullTitlePost by rememberSaveable {
        mutableStateOf(false)
    }
    Column(modifier = modifier.padding(horizontal = 16.dp)) {
        Text(
            text = buildAnnotatedString {
                append(likes)
                append(" likes")
            },
            letterSpacing = 0.sp,
            fontWeight = FontWeight.W500,
            fontSize = 14.sp
        )
        Text(
            text = buildAnnotatedString {
                append(
                    AnnotatedString(
                        text = name,
                        spanStyle = SpanStyle(fontWeight = FontWeight.Bold)
                    )
                )
                append("  $contentDesc")
            },
            fontSize = 14.sp,
            letterSpacing = 0.sp,
            lineHeight = 16.sp,
            maxLines = if (fullTitlePost) Int.MAX_VALUE else 1,
            overflow = TextOverflow.Ellipsis
        )
        Text(
            text = if (fullTitlePost) "" else "more", fontSize = 14.sp,
            letterSpacing = 0.sp,
            lineHeight = 16.sp, color = MaterialTheme.colorScheme.secondary,
            modifier = modifier.clickable { fullTitlePost = true }
        )
        Row(
            modifier = modifier,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = modifier
                    .clip(CircleShape)
                    .size(20.dp)
            ) {
                AsyncImage(
                    model = ImageRequest.Builder(context)
                        .data(peopleImage)
                        .crossfade(true)
                        .build(),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = modifier.fillMaxWidth()
                )
            }
            Text(
                text = "Add a comment...", fontSize = 14.sp,
                letterSpacing = 0.sp,
                lineHeight = 12.sp, color = MaterialTheme.colorScheme.secondary,
                modifier = modifier
                    .padding(horizontal = 8.dp, vertical = 6.dp)
                    .clickable { addComment(true) }
            )
        }
        Text(
            text = timeMoments, fontSize = 12.sp,
            letterSpacing = 0.sp,
            lineHeight = 10.sp, color = MaterialTheme.colorScheme.secondary,
        )
    }
}
