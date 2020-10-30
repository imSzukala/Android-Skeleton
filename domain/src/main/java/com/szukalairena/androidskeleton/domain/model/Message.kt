package com.szukalairena.androidskeleton.domain.model

import com.squareup.moshi.Json

data class Message(
    @Json(name = "id") val id: Long,
    @Json(name = "title") val title: String,
    @Json(name = "text") val text: String
)
