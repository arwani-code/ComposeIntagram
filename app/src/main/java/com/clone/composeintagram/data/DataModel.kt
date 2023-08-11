package com.clone.composeintagram.data

data class DataModel(
    val statusImage: String = "",
    val name: String = "",
    val peopleImage: String = "",
    val postImage: List<String> = listOf(),
    val likes: String = "",
    val contentDescription: String = "",
    val moments: String = ""
)
