package com.szukalairena.androidskeleton.base.extensions

import androidx.fragment.app.Fragment
import com.szukalairena.androidskeleton.base.util.clearOnDestroy

fun <T> Fragment.clearOnViewDestroy() = clearOnDestroy<T> { viewLifecycleOwner.lifecycle }
