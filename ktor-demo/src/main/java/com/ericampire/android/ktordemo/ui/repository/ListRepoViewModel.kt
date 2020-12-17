package com.ericampire.android.ktordemo.ui.repository

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ericampire.android.ktordemo.entity.Repository
import kotlinx.coroutines.launch
import javax.inject.Inject

class ListRepoViewModel @ViewModelInject constructor(
    private val repository: ListRepoRepository
) : ViewModel() {

    private val _data = MutableLiveData<List<Repository>>()
    val data: LiveData<List<Repository>>
        get() = _data

    init {
        fetchRepository()
    }

    fun fetchRepository() = viewModelScope.launch {
        _data.value = repository.getRepository()
    }
}