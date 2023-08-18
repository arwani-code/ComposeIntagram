package com.clone.composeintagram.ui.search

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.clone.composeintagram.data.DataModel
import com.clone.composeintagram.data.IgHomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(igHomeRepository: IgHomeRepository) : ViewModel() {

    private val _dataItems = MutableStateFlow<List<DataModel>>(emptyList())
    val dataItems: StateFlow<List<DataModel>> = _dataItems.asStateFlow()

    init {
       viewModelScope.launch {
           _dataItems.value = igHomeRepository.dataSearchItems
       }
    }
}