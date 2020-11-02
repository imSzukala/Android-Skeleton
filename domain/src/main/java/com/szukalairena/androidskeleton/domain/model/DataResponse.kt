package com.szukalairena.androidskeleton.domain.model

import com.squareup.moshi.Json

data class DataResponse<T>(
    @Json(name = "data") val data: T
)
