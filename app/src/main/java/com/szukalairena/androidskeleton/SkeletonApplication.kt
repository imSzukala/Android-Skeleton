package com.szukalairena.androidskeleton

import android.app.Application
import com.facebook.stetho.Stetho

class SkeletonApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
    }
}
