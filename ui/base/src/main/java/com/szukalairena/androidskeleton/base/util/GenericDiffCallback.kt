package com.szukalairena.androidskeleton.base.util

import android.annotation.SuppressLint
import androidx.recyclerview.widget.DiffUtil

@SuppressLint("DiffUtilEquals")
class GenericDiffCallback<T : UniqueId> : DiffUtil.ItemCallback<T>() {

    override fun areItemsTheSame(item1: T, item2: T): Boolean {
        return item1.getUniqueId() == item2.getUniqueId()
    }

    override fun areContentsTheSame(item1: T, item2: T): Boolean {
        return item1 == item2
    }
}
