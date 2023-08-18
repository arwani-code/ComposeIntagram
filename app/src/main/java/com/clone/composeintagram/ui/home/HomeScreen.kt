package com.clone.composeintagram.ui.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SheetState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.clone.composeintagram.ui.components.ModalBottomSheetComments
import com.clone.composeintagram.ui.home.components.CardHomeItem
import com.clone.composeintagram.ui.home.components.RowIgStatus

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = hiltViewModel(),
    nestedScrollConnection: NestedScrollConnection,
    sheetState: SheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = true,
    )
) {
    val igStatus by viewModel.statusIg.collectAsStateWithLifecycle()
    val statusIgBorder by viewModel.statusIgBorder.collectAsStateWithLifecycle()
    val dataItems by viewModel.dataItems.collectAsStateWithLifecycle()
    var openComment by rememberSaveable {
        mutableStateOf(false)
    }

    Box(modifier = modifier.fillMaxSize()) {
        ModalBottomSheetComments(
            state = sheetState,
            openComment = openComment,
            onDismiss = { openComment = false })
        LazyColumn(
            modifier = modifier
                .fillMaxSize()
                .nestedScroll(nestedScrollConnection)
        ) {
            item {
                RowIgStatus(
                    igStatus = igStatus,
                    statusIgBorder = statusIgBorder
                )
            }
            items(dataItems, key = { it.peopleImage }) {
                CardHomeItem(data = it, addComment = { openComment = true })
            }
        }
    }
}