package com.szukalairena.androidskeleton.base

import android.os.Bundle
import androidx.annotation.CallSuper
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {

    lateinit var binding: VB

    @CallSuper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = this.setBinding()
        setContentView(binding.root)
    }

    abstract fun setBinding(): VB
}
