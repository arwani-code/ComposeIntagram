package com.clone.composeintagram.ui.profile

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.clone.composeintagram.data.DataModel
import com.clone.composeintagram.data.IgRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    private val igRepository: IgRepository
) : ViewModel() {

    private val removeFollowed = mutableStateListOf<DataModel>()
    private val _dataItems = MutableStateFlow<List<DataModel>>(emptyList())
    val dataItems: StateFlow<List<DataModel>> = _dataItems.asStateFlow()

    init {
        _dataItems.value = igRepository.followedProfile
    }

    fun removeItemFollowed(data: DataModel) {
        viewModelScope.launch {
            removeFollowed.add(data)
            val dataItem = withContext(Dispatchers.Default) {
                igRepository.followedProfile.filter { !removeFollowed.contains(it) }
            }
            _dataItems.value = dataItem
        }
    }
}