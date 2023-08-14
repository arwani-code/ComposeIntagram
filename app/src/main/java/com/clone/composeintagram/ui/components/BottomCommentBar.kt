package com.clone.composeintagram.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.clone.composeintagram.ui.utils.SizeScreen

@Composable
fun BottomCommentBar(
    modifier: Modifier = Modifier,
    navigateUp: () -> Unit,
    onChangeValue: (String) -> Unit,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default.copy(
        capitalization = KeyboardCapitalization.Characters,
        keyboardType = KeyboardType.Text
    )
) {
    val size = SizeScreen()
    val height = (size.height() / 2).dp
    var value by rememberSaveable {
        mutableStateOf("")
    }

    val focusRequester = remember { FocusRequester() }
    val focusManager = LocalFocusManager.current
    LaunchedEffect(Unit) {
        focusRequester.requestFocus()
    }

    Column(modifier = modifier, verticalArrangement = Arrangement.Bottom) {
        Row(
            modifier = modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.Bottom,
        ) {
            Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
                OutlinedTextField(
                    value = value,
                    onValueChange = {
                        value = it
                        onChangeValue(value)
                    },
                    keyboardOptions = keyboardOptions,
                    modifier = modifier
                        .fillMaxWidth()
                        .heightIn(min = 25.dp)
                        .focusRequester(focusRequester),
                    singleLine = true,
                    placeholder = {
                        Text(
                            color = MaterialTheme.colorScheme.secondary,
                            text = "Search ...",
                            fontSize = 16.sp,
                        )
                    },
                    colors = TextFieldDefaults.colors(
                        focusedIndicatorColor = MaterialTheme.colorScheme.background,
                        unfocusedIndicatorColor = MaterialTheme.colorScheme.background,
                        cursorColor = MaterialTheme.colorScheme.onBackground,
                        unfocusedContainerColor = MaterialTheme.colorScheme.background,
                        focusedContainerColor = MaterialTheme.colorScheme.background
                    ),
                    keyboardActions = KeyboardActions(
                        onDone = { focusManager.clearFocus() }
                    ),
                )
            }
        }
    }
}