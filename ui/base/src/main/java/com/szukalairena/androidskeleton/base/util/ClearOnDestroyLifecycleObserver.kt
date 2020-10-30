package com.szukalairena.androidskeleton.base.util

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import kotlin.reflect.KProperty

class ClearOnDestroyLifecycleObserver<T>(private val lazyLifecycle: () -> Lifecycle) :
    LifecycleObserver {

    private var value: T? = null

    operator fun getValue(thisRef: Any?, property: KProperty<*>): T =
        value ?: throw IllegalStateException("Not initialized or outside of lifecycle.")

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        lazyLifecycle().removeObserver(this)
        this.value = value
        lazyLifecycle().addObserver(this)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun clear() {
        value = null
    }
}

fun <T> clearOnDestroy(lazyLifecycle: () -> Lifecycle) =
    ClearOnDestroyLifecycleObserver<T>(lazyLifecycle = lazyLifecycle)
