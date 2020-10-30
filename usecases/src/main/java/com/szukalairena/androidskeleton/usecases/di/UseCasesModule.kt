package com.szukalairena.androidskeleton.usecases.di

import com.szukalairena.androidskeleton.usecases.messages.MessagesUseCase
import org.koin.dsl.module

val useCasesModule = module {
    factory { MessagesUseCase(get()) }
}
