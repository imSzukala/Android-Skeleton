package com.szukalairena.androidskeleton.usecases.messages

import com.szukalairena.androidskeleton.domain.repository.MessagesRepository
import com.szukalairena.androidskeleton.usecases.messages.model.MessagesData

class MessagesUseCase(private val messagesRepository: MessagesRepository) {

    suspend fun getMessagesData() = MessagesData(
        title = "Tittle",
        messages = messagesRepository.getMessages()
    )
}
