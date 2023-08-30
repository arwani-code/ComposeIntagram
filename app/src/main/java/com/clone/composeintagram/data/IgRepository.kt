package com.clone.composeintagram.data

import androidx.compose.ui.graphics.Color
import javax.inject.Inject

class IgRepository @Inject constructor(
    igLocalDataSource: IgLocalDataSource
) {
    val igStatus: List<DataModel> = igLocalDataSource.statusIg
    val igStatusBorder: List<Color> = igLocalDataSource.colorList
    val homeItems: List<DataModel> = igLocalDataSource.dataItems
    val dataSearchItems: List<DataModel> = igLocalDataSource.dataSearchItem
    val sampleVideos: List<Video> = igLocalDataSource.sampleVideos
}