package com.ericampire.android.ktordemo.ui.repository

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ericampire.android.ktordemo.R
import org.koin.androidx.viewmodel.ext.android.viewModel


class ListRepoFragment : Fragment(R.layout.fragment_repository) {

    private val viewModel by viewModel<ListRepoViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.fetchRepository()
    }
}