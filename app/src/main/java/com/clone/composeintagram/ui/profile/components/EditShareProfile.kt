package com.clone.composeintagram.ui.profile.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.clone.composeintagram.base.addPeople
import com.clone.composeintagram.ui.utils.SizeScreen

@Composable
fun EditShareProfile(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .padding(horizontal = 12.dp, vertical = 18.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        ButtonProfile(text = "Edit Profile", modifier = modifier)
        ButtonProfile(text = "Share Profile", modifier = modifier)
        ButtonProfile(modifier = modifier, image = addPeople())
    }
}

@Composable
private fun ButtonProfile(
    modifier: Modifier,
    text: String = "",
    image: ImageVector? = null,
    sizeScreen: SizeScreen = SizeScreen()
) {
    Row {
        OutlinedButton(
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor =  MaterialTheme.colorScheme.onBackground.copy(alpha = 0.1f),
            ),
            border = BorderStroke(width = 1.dp, color =  Color.Transparent),
            shape = RoundedCornerShape(12.dp),
            modifier = modifier.size(
                width = if (image == null) (sizeScreen.width() / 2.7).dp else 70.dp,
                height = 35.dp
            ),
        ) {
            if (image == null) {
                Text(
                    text = text,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground,
                    fontSize = 14.sp
                )
            } else {
                Image(
                    imageVector = addPeople(),
                    contentDescription = "",
                    colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.onBackground)
                )
            }
        }
    }
}