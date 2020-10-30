package com.szukalairena.androidskeleton

import android.app.Application
import com.facebook.stetho.Stetho
import com.szukalairena.androidskeleton.data.di.dataModule
import com.szukalairena.androidskeleton.network.di.networkModule
import com.szukalairena.androidskeleton.usecases.di.useCasesModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

@Suppress("UNUSED")
class SkeletonApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
        Stetho.initializeWithDefaults(this)
    }

    private fun initKoin() {
        startKoin {
            if (BuildConfig.DEBUG) {
                androidLogger()
            }
            androidContext(this@SkeletonApplication)
            modules(dataModule, networkModule, useCasesModule)
        }
    }
}
