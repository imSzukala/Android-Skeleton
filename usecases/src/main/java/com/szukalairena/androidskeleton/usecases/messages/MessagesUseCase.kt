package com.szukalairena.androidskeleton.usecases.messages

import com.szukalairena.androidskeleton.domain.repository.MessagesRepository
import com.szukalairena.androidskeleton.usecases.messages.model.MessagesUiData

class MessagesUseCase(private val messagesRepository: MessagesRepository) {

    suspend fun getMessagesUiData() = MessagesUiData(
        title = "Tittle",
        messages = messagesRepository.getMessages().sortedBy { it.id }
    )
}
