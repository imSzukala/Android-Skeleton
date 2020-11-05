package com.szukalairena.androidskeleton.messages

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.szukalairena.androidskeleton.design.util.GenericDiffCallback
import com.szukalairena.androidskeleton.messages.databinding.ItemMessageBinding
import com.szukalairena.androidskeleton.messages.model.MessageItem

class MessageItemAdapter : ListAdapter<MessageItem, MessageItemViewHolder>(
    GenericDiffCallback<MessageItem>()
) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        MessageItemViewHolder(parent, ItemMessageBinding::inflate)

    override fun onBindViewHolder(holder: MessageItemViewHolder, position: Int) =
        holder.bind(getItem(position))
}
