package com.szukalairena.androidskeleton.messages

import androidx.lifecycle.Observer
import com.szukalairena.androidskeleton.basetest.CoroutinesTestExtension
import com.szukalairena.androidskeleton.basetest.InstantExecutorExtension
import com.szukalairena.androidskeleton.messages.model.MessagesUiData
import com.szukalairena.androidskeleton.usecases.messages.MessagesUseCase
import com.szukalairena.androidskeleton.usecases.messages.model.MessagesData
import io.mockk.coEvery
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import io.mockk.mockk
import io.mockk.verify
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExperimentalCoroutinesApi
@ExtendWith(MockKExtension::class, InstantExecutorExtension::class, CoroutinesTestExtension::class)
class MessagesViewModelTest {

    @MockK
    lateinit var messagesUseCase: MessagesUseCase
    private lateinit var viewModel: MessagesViewModel

    @BeforeEach
    fun setUp() {
        viewModel = MessagesViewModel(messagesUseCase)
    }

    @Test
    fun `Should return messages`() = runBlockingTest {
        // Given
        val data = MessagesData("title", emptyList())
        coEvery { messagesUseCase.getMessagesData() } returns data
        val mockedObserver: Observer<MessagesUiData> = mockk()
        // When
        viewModel.messagesUiDataLiveData.observeForever(mockedObserver)
        viewModel.getMessagesUiData()
        // Then
        verify {
            mockedObserver.onChanged(MessagesUiData("title", emptyList()))
        }
    }
}
