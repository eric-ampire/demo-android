package com.ericampire.android.ktordemo.ui.repository

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.ericampire.android.ktordemo.R
import dagger.hilt.android.AndroidEntryPoint
import org.koin.androidx.viewmodel.ext.android.viewModel


@AndroidEntryPoint
class ListRepoFragment : Fragment(R.layout.fragment_repository) {

    private val viewModel by viewModels<ListRepoViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.fetchRepository()
    }
}