package com.szukalairena.androidskeleton.base

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.ColorRes
import androidx.annotation.DimenRes
import androidx.annotation.StringRes
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.szukalairena.androidskeleton.base.extensions.getColorCompat
import com.szukalairena.androidskeleton.base.extensions.getDimensionPixelSize
import com.szukalairena.androidskeleton.base.util.UniqueId

abstract class BaseViewHolder<T : ViewBinding, in M : UniqueId> private constructor(
    val binding: T
) : RecyclerView.ViewHolder(binding.root) {

    protected val context: Context = itemView.context

    constructor(
        parent: ViewGroup,
        creator: (inflater: LayoutInflater, root: ViewGroup, attachToRoot: Boolean) -> T
    ) : this(creator(LayoutInflater.from(parent.context), parent, false))

    abstract fun bind(item: M)

    protected fun getString(@StringRes stringRes: Int) = context.getString(stringRes)

    protected fun getColor(@ColorRes colorRes: Int) = context.getColorCompat(colorRes)

    protected fun getDimen(@DimenRes dimenRes: Int) = context.getDimensionPixelSize(dimenRes)
}
