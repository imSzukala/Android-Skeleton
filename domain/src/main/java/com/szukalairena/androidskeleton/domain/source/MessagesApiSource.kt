package com.szukalairena.androidskeleton.domain.source

import com.szukalairena.androidskeleton.domain.model.DataResponse
import com.szukalairena.androidskeleton.domain.model.Message

interface MessagesApiSource {
    suspend fun getMessages(): DataResponse<List<Message>>
}
