package com.szukalairena.androidskeleton.network.api.messages

import com.szukalairena.androidskeleton.domain.model.DataResponse
import com.szukalairena.androidskeleton.domain.model.Message

class MessagesApiMock : MessagesApi {

    override suspend fun getMessages(): DataResponse<List<Message>> = DataResponse(
        data = (0..20).map {
            Message(
                id = it.toLong(),
                title = "Title $it",
                text = "Message text $it"
            )
        }
    )
}
