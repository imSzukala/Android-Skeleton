package com.szukalairena.androidskeleton.messages.model

import com.szukalairena.androidskeleton.base.util.UniqueId

data class MessageItem(
    private val id: Long,
    val title: String,
    val text: String
) : UniqueId {
    override fun getUniqueId() = id
}
