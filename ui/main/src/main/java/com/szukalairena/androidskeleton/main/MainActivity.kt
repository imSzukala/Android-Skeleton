package com.szukalairena.androidskeleton.main

import com.szukalairena.androidskeleton.base.BaseActivity
import com.szukalairena.androidskeleton.main.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun setBinding(): ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
}
