package com.szukalairena.androidskeleton.network.api.messages

import com.szukalairena.androidskeleton.domain.model.DataResponse
import com.szukalairena.androidskeleton.domain.model.Message
import com.szukalairena.androidskeleton.domain.source.MessagesApiSource
import retrofit2.http.GET

interface MessagesApi : MessagesApiSource {

    @GET("messages")
    override suspend fun getMessages(): DataResponse<List<Message>>
}
