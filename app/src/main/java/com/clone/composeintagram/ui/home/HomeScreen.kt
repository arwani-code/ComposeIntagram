package com.clone.composeintagram.ui.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.clone.composeintagram.ui.home.components.CardHomeItem
import com.clone.composeintagram.ui.home.components.RowIgStatus

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = hiltViewModel(),
    lazyListState: LazyListState,
    nestedScrollConnection: NestedScrollConnection
) {
    val igStatus by viewModel.statusIg.collectAsStateWithLifecycle()
    val statusIgBorder by viewModel.statusIgBorder.collectAsStateWithLifecycle()
    val dataItems by viewModel.dataItems.collectAsStateWithLifecycle()

    Box(
        modifier = modifier
            .fillMaxSize()
            .nestedScroll(nestedScrollConnection)
    ) {
        LazyColumn(
            contentPadding = PaddingValues(end = 10.dp),
            state = lazyListState,
        ) {
            item {
                RowIgStatus(
                    igStatus = igStatus,
                    statusIgBorder = statusIgBorder
                )
            }
            items(dataItems, key = { it.peopleImage }) {
                CardHomeItem(data = it)
            }
        }
    }
}