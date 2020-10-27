package com.szukalairena.androidskeleton.network.api.messages

import com.szukalairena.androidskeleton.domain.model.Message
import com.szukalairena.androidskeleton.domain.source.MessagesSource
import retrofit2.http.GET

interface MessagesApi : MessagesSource {

    @GET("messages")
    override suspend fun getMessages(): List<Message>
}
