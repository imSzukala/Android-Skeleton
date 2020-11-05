package com.szukalairena.androidskeleton.messages

import android.os.Bundle
import android.view.View
import com.szukalairena.androidskeleton.design.BaseFragment
import com.szukalairena.androidskeleton.messages.databinding.FragmentMessagesBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MessagesFragment : BaseFragment<MessagesViewModel, FragmentMessagesBinding>() {

    override val viewModel: MessagesViewModel by viewModel()
    override fun setBinding(): FragmentMessagesBinding =
        FragmentMessagesBinding.inflate(layoutInflater)

    private lateinit var messageItemAdapter: MessageItemAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)
        configureMessageItemsList()
        setupObservers()

        viewModel.getMessagesUiData()
    }

    private fun configureMessageItemsList() {
        messageItemAdapter = MessageItemAdapter()
        with(binding.messages) {
            adapter = messageItemAdapter
        }
    }

    private fun setupObservers() {
        viewModel.messagesUiDataLiveData.observe(viewLifecycleOwner) {
            messageItemAdapter.submitList(it.messages)
            binding.title.text = it.title
        }
    }
}
