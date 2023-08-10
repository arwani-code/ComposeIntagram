package com.clone.composeintagram.ui.home.components

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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

@Composable
fun CardHomeItem(
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    Column(
        modifier = modifier
            .padding(vertical = 16.dp)
            .fillMaxWidth()
    ) {
        RowTopView(context = context)
        CardImageView(context = context)
        CommentSection()
    }
}

@Composable
private fun RowTopView(
    modifier: Modifier = Modifier,
    context: Context
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
                        .padding(1.5.dp)
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
//                            .data("https://instagram.fcgk16-1.fna.fbcdn.net/v/t51.2885-19/353075677_1476803672724898_7186900499832148947_n.jpg?stp=dst-jpg_s150x150&_nc_ht=instagram.fcgk16-1.fna.fbcdn.net&_nc_cat=1&_nc_ohc=p-9yR_3h16IAX9QA5gf&edm=AJ9x6zYBAAAA&ccb=7-5&oh=00_AfCyiHfAE_EWKEpz8c1CszD6BbEBYqH9IuT0poTkULq7zA&oe=64DA2591&_nc_sid=65462d")
                            .data("https://scontent.cdninstagram.com/v/t51.2885-19/314827144_688732645901903_7513758145817461481_n.jpg?stp=dst-jpg_s150x150&_nc_ht=scontent.cdninstagram.com&_nc_cat=111&_nc_ohc=C5De3MJG0VsAX8RqXb9&edm=APs17CUBAAAA&ccb=7-5&oh=00_AfASoNr5RxMTcQlBJ8OfOPDtWfEaYGakfdFFXHulNN4WOg&oe=64D66580&_nc_sid=10d13b")
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
                text = "ahmadarwani",
                modifier = modifier.padding(horizontal = 8.dp),
                fontSize = 14.sp,
                letterSpacing = 0.sp,
                fontWeight = FontWeight.W500
            )
            Image(imageVector = verifiedVector(), contentDescription = "", modifier = modifier)
        }
        Image(
            imageVector = Icons.Sharp.MoreVert,
//            imageVector = moreVector(),
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
    context: Context
) {
    Column(
        modifier = modifier
            .padding(top = 8.dp)
            .fillMaxWidth()
    ) {
        AsyncImage(
            model = ImageRequest.Builder(context)
                .data("https://scontent-sin6-2.cdninstagram.com/v/t39.30808-6/366551708_849021513254470_6821465593141777921_n.jpg?stp=dst-jpg_e15&_nc_ht=scontent-sin6-2.cdninstagram.com&_nc_cat=1&_nc_ohc=sQ0mRO-2zA4AX_zUBB6&edm=AJ9x6zYAAAAA&ccb=7-5&ig_cache_key=MzE2NTUxNDkwMzYyMjcyNjg0NQ%3D%3D.2-ccb7-5&oh=00_AfDDARTQq4glksqbOoM-fL8hjQORlCWisQb7kHA-HnFc6A&oe=64DA598F&_nc_sid=65462d")
                .crossfade(true)
                .build(),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = modifier.fillMaxWidth()
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
                Icon(imageVector = loveVector(), contentDescription = "")
                Icon(
                    imageVector = commentVector(),
                    contentDescription = "",
                    modifier = modifier.padding(horizontal = 20.dp)
                )
                Icon(imageVector = postCommentVector(), contentDescription = "")
            }
            Icon(imageVector = saveVector(), contentDescription = "")
        }
    }
}

@Composable
fun CommentSection(
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.padding(horizontal = 16.dp)) {
        Text(
            text = buildAnnotatedString {
                append("255,334 ")
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
                        text = "ahmadarwani ",
                        spanStyle = SpanStyle(fontWeight = FontWeight.Bold)
                    )
                )
                append("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,")
                append("more")
            },
            fontSize = 14.sp,
            letterSpacing = 0.sp,
            lineHeight = 16.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}