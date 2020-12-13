package com.ericampire.android.ktordemo.ui.repository

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import javax.inject.Inject

class ListRepoViewModel @ViewModelInject constructor(
    private val repository: ListRepoRepository
) : ViewModel() {

    init {
        fetchRepository()
    }

    fun fetchRepository() = viewModelScope.launch {
        repository.getRepository()
    }
}