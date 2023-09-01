package com.clone.composeintagram.ui.profile.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


@Composable
fun TopProfileSection(
    modifier: Modifier = Modifier,
    totalCount: String,
    title: String
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = totalCount, fontSize = 18.sp, fontWeight = FontWeight.Bold)
        Text(text = title, fontSize = 14.sp, letterSpacing = 0.sp)
    }
}