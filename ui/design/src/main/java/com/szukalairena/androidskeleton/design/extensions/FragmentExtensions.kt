package com.szukalairena.androidskeleton.design.extensions

import androidx.fragment.app.Fragment
import com.szukalairena.androidskeleton.design.util.clearOnDestroy

fun <T> Fragment.clearOnViewDestroy() = clearOnDestroy<T> { viewLifecycleOwner.lifecycle }
