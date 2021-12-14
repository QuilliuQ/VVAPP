package com.sylas.vvapp.repository.model

data class ContentDto(
    val viewType: String,
    val padding: Int,
    val children: List<ContentDto>
)
