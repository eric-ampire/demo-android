package com.ericampire.android.ktordemo.ui.repository

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ListRepoViewModel(private val repository: ListRepoRepository) : ViewModel() {
    init {
        fetchRepository()
    }

    fun fetchRepository() = viewModelScope.launch {
        repository.getRepository()
    }
}