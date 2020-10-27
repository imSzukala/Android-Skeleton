package com.szukalairena.androidskeleton.domain.repository

import com.szukalairena.androidskeleton.domain.model.Message

interface MessagesRepository {
    suspend fun getMessages(): List<Message>
}
