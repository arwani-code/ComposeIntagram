package com.clone.composeintagram.ui.reels

import androidx.lifecycle.ViewModel
import com.clone.composeintagram.data.DataModel
import com.clone.composeintagram.data.IgRepository
import com.clone.composeintagram.data.Video
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class ReelsViewModel @Inject constructor(igRepository: IgRepository) : ViewModel() {

    private val _dataItems = MutableStateFlow<List<Video>>(emptyList())
    val dataItems: StateFlow<List<Video>> = _dataItems.asStateFlow()

    init {
        _dataItems.value = igRepository.sampleVideos
    }
}