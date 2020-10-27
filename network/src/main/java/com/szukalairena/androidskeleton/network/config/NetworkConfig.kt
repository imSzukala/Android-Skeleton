package com.szukalairena.androidskeleton.network.config

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import com.szukalairena.androidskeleton.network.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

internal fun provideMoshi() = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

internal fun provideMoshiConverterFactory(moshi: Moshi) = MoshiConverterFactory.create(moshi)

internal fun provideHttpLoggingInterceptor() = HttpLoggingInterceptor().apply {
    level = if (BuildConfig.DEBUG)
        HttpLoggingInterceptor.Level.BODY
    else
        HttpLoggingInterceptor.Level.NONE
}

internal fun provideOkHttpClient(httpLoggingInterceptor: HttpLoggingInterceptor) =
    OkHttpClient.Builder()
        .addInterceptor(httpLoggingInterceptor)
        .build()

internal fun provideRetrofit(
    okHttpClient: OkHttpClient,
    moshiConverterFactory: MoshiConverterFactory
) = Retrofit.Builder()
    .baseUrl("")
    .addConverterFactory(moshiConverterFactory)
    .client(okHttpClient)
    .build()
