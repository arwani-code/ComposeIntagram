package com.clone.composeintagram.ui.home

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.clone.composeintagram.ui.home.components.CardHomeItem
import com.clone.composeintagram.ui.home.components.RowIgStatus

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val igStatus by viewModel.statusIg.collectAsStateWithLifecycle()
    val statusIgBorder by viewModel.statusIgBorder.collectAsStateWithLifecycle()

    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(vertical = 10.dp)
    ) {
        item {
            RowIgStatus(
                igStatus = igStatus,
                statusIgBorder = statusIgBorder
            )
        }
        item {
            CardHomeItem()
        }
    }
}