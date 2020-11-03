package com.szukalairena.androidskeleton.data.repository

import com.szukalairena.androidskeleton.domain.model.DataResponse
import com.szukalairena.androidskeleton.domain.model.Message
import com.szukalairena.androidskeleton.domain.source.MessagesApiSource
import com.szukalairena.androidskeleton.unittest.CoroutinesTestExtension
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExperimentalCoroutinesApi
@ExtendWith(MockKExtension::class, CoroutinesTestExtension::class)
class MessagesRepositoryImplTest {

    @MockK
    lateinit var messagesApiSource: MessagesApiSource
    private lateinit var repository: MessagesRepositoryImpl

    @BeforeEach
    fun setUp() {
        repository = MessagesRepositoryImpl(messagesApiSource)
    }

    @Test
    fun `Should call API and return messages`() = runBlockingTest {
        // Given
        val response = DataResponse(emptyList<Message>())
        coEvery { messagesApiSource.getMessages() } returns response
        // When
        val messages = repository.getMessages()
        // Then
        Assertions.assertEquals(messages, emptyList<Message>())
        coVerify { messagesApiSource.getMessages() }
    }
}
