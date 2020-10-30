package com.szukalairena.androidskeleton.usecases.messages.model

import com.szukalairena.androidskeleton.domain.model.Message

data class MessagesData(
    val title: String,
    val messages: List<Message>
)
