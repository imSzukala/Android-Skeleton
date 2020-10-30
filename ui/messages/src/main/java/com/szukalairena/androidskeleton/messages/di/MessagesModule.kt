package com.szukalairena.androidskeleton.messages.di

import com.szukalairena.androidskeleton.messages.MessagesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val messagesModule = module {
    viewModel { MessagesViewModel(get()) }
}
