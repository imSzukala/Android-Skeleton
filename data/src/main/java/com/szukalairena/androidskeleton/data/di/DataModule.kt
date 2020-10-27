package com.szukalairena.androidskeleton.data.di

import com.szukalairena.androidskeleton.data.repository.MessagesRepositoryImpl
import com.szukalairena.androidskeleton.domain.repository.MessagesRepository
import org.koin.dsl.module

@Suppress("USELESS_CAST")
val dataModule = module {
    factory { MessagesRepositoryImpl(get()) as MessagesRepository }
}
