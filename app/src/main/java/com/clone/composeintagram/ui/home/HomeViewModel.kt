package com.clone.composeintagram.ui.home

import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import com.clone.composeintagram.data.DataModel
import com.clone.composeintagram.data.IgRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    igHomeRepository: IgRepository
) : ViewModel() {

    private val _statusIg = MutableStateFlow<List<DataModel>>(emptyList())
    val statusIg: StateFlow<List<DataModel>> = _statusIg.asStateFlow()

    private val _statusIgBorder = MutableStateFlow<List<Color>>(emptyList())
    val statusIgBorder: StateFlow<List<Color>> = _statusIgBorder.asStateFlow()

    private val _dataItems = MutableStateFlow<List<DataModel>>(emptyList())
    val dataItems: StateFlow<List<DataModel>> = _dataItems.asStateFlow()

    init {
        _statusIg.value = igHomeRepository.igStatus
        _statusIgBorder.value = igHomeRepository.igStatusBorder
        _dataItems.value = igHomeRepository.homeItems
    }

}