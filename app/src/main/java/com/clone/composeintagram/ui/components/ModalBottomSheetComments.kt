package com.clone.composeintagram.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SheetState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ModalBottomSheetComments(
    modifier: Modifier = Modifier,
    state: SheetState,
    openComment: Boolean,
    onDismiss: () -> Unit,
    openSheetReport: Boolean = false
) {
    val scope = rememberCoroutineScope()
    LaunchedEffect(key1 = openComment, block = {
        if (openComment) state.show()
    })

    if (state.isVisible && !openSheetReport) {
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            ModalBottomSheet(
                windowInsets = WindowInsets(0),
                onDismissRequest = {
                    scope.launch {
                        onDismiss()
                        state.hide()
                    }
                },
                modifier = modifier
                    .padding(top = 16.dp),
            ) {
                Column(
                    modifier = modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colorScheme.background),
                ) {
                    Column(
                        modifier
                            .navigationBarsPadding()
                            .fillMaxSize()
                            .background(MaterialTheme.colorScheme.background),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Text(
                            text = "Comments",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.W500,
                            letterSpacing = 0.sp,
                            modifier = modifier.padding(top = 8.dp, bottom = 16.dp)
                        )
                        Divider(color = MaterialTheme.colorScheme.onBackground)
                        Text(
                            text = "Belum Ada Komentar",
                            modifier = modifier.padding(top = 100.dp),
                            fontWeight = FontWeight.SemiBold
                        )
                        Spacer(modifier = modifier.height(10.dp))
                        Text(text = "Mulai Percakapan", fontSize = 12.sp)
                        Spacer(modifier = modifier.height(30.dp))
                    }
                }
            }
        }
    }
    
}