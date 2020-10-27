package com.szukalairena.androidskeleton.network.di

import com.szukalairena.androidskeleton.domain.source.MessagesSource
import com.szukalairena.androidskeleton.network.config.provideHttpLoggingInterceptor
import com.szukalairena.androidskeleton.network.config.provideMessagesApi
import com.szukalairena.androidskeleton.network.config.provideMoshi
import com.szukalairena.androidskeleton.network.config.provideMoshiConverterFactory
import com.szukalairena.androidskeleton.network.config.provideOkHttpClient
import com.szukalairena.androidskeleton.network.config.provideRetrofit
import org.koin.dsl.module

@Suppress("USELESS_CAST")
val networkModule = module {
    factory { provideHttpLoggingInterceptor() }
    factory { provideOkHttpClient(get()) }
    factory { provideMoshi() }
    factory { provideMoshiConverterFactory(get()) }
    single { provideRetrofit(get(), get()) }

    single { provideMessagesApi(get()) as MessagesSource }
}
