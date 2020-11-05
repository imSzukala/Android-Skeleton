package com.szukalairena.androidskeleton.messages

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.szukalairena.androidskeleton.design.BaseViewModel
import com.szukalairena.androidskeleton.domain.model.Message
import com.szukalairena.androidskeleton.messages.model.MessageItem
import com.szukalairena.androidskeleton.messages.model.MessagesUiData
import com.szukalairena.androidskeleton.usecases.messages.MessagesUseCase
import com.szukalairena.androidskeleton.usecases.messages.model.MessagesData
import kotlinx.coroutines.launch

// TODO add view states
class MessagesViewModel(private val messagesUseCase: MessagesUseCase) : BaseViewModel() {

    private val _messagesUiDataLiveData = MutableLiveData<MessagesUiData>()
    val messagesUiDataLiveData: LiveData<MessagesUiData> = _messagesUiDataLiveData

    fun getMessagesUiData() {
        viewModelScope.launch {
            try {
                _messagesUiDataLiveData.value = messagesUseCase.getMessagesData().toMessagesUiData()
            } catch (error: Throwable) {
                // TODO error handling
            }
        }
    }

    private fun MessagesData.toMessagesUiData() = MessagesUiData(
        title = this.title,
        messages = this.messages.map { it.toMessageItem() }
    )

    private fun Message.toMessageItem() = MessageItem(
        title = this.title,
        text = this.text,
        id = this.id
    )
}
