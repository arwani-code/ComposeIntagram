package com.clone.composeintagram.data

data class DataModel(
    val statusImage: String = "",
    val name: String = "",
    val peopleImage: String = "",
    val postImage: String = "",
    val likes: String = "",
    val contentDescription: String = "",
    val moments: String = "",
    val canLargeImage: Boolean = false
)

data class Video(
    val url: String,
    val thumbnail: String,
    val isFavorite: Boolean = false,
)
