package com.szukalairena.androidskeleton.network.config

import com.szukalairena.androidskeleton.network.api.messages.MessagesApi
import retrofit2.Retrofit
import retrofit2.create

internal fun provideMessagesApi(retrofit: Retrofit): MessagesApi = retrofit.create()
