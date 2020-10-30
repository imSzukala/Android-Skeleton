package com.szukalairena.androidskeleton.data.repository

import com.szukalairena.androidskeleton.domain.repository.MessagesRepository
import com.szukalairena.androidskeleton.domain.source.MessagesApiSource

class MessagesRepositoryImpl(
    private val messagesApiSource: MessagesApiSource
) : MessagesRepository {
    override suspend fun getMessages() = messagesApiSource.getMessages()
}
