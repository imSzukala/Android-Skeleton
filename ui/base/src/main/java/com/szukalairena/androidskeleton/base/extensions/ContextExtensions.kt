package com.szukalairena.androidskeleton.base.extensions

import android.content.Context
import androidx.annotation.ColorRes
import androidx.annotation.DimenRes
import androidx.core.content.ContextCompat

fun Context.getColorCompat(@ColorRes color: Int) = ContextCompat.getColor(this, color)

fun Context.getDimensionPixelSize(@DimenRes dimen: Int) = resources.getDimensionPixelSize(dimen)
