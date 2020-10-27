package com.szukalairena.androidskeleton.data.repository

import com.szukalairena.androidskeleton.domain.repository.MessagesRepository
import com.szukalairena.androidskeleton.domain.source.MessagesSource

class MessagesRepositoryImpl(private val messagesSource: MessagesSource) : MessagesRepository {
    override suspend fun getMessages() = messagesSource.getMessages()
}
