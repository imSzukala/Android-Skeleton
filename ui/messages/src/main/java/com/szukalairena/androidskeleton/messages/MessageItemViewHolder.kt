package com.szukalairena.androidskeleton.messages

import android.view.LayoutInflater
import android.view.ViewGroup
import com.szukalairena.androidskeleton.design.BaseViewHolder
import com.szukalairena.androidskeleton.messages.databinding.ItemMessageBinding
import com.szukalairena.androidskeleton.messages.model.MessageItem

class MessageItemViewHolder(
    parent: ViewGroup,
    creator: (
        inflater: LayoutInflater,
        root: ViewGroup,
        attachToRoot: Boolean
    ) -> ItemMessageBinding
) : BaseViewHolder<ItemMessageBinding, MessageItem>(parent, creator) {

    override fun bind(item: MessageItem) {
        binding.title.text = item.title
        binding.text.text = item.text
    }
}
