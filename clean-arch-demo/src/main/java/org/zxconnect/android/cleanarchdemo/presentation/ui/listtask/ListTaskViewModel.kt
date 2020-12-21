package org.zxconnect.android.cleanarchdemo.presentation.ui.listtask

import com.airbnb.mvrx.MavericksViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import org.zxconnect.android.cleanarchdemo.domain.mapper.TaskUiModelMapper
import org.zxconnect.android.cleanarchdemo.domain.usecase.GetTaskListUseCase

class ListTaskViewModel(
    initialState: ListTaskState
) : MavericksViewModel<ListTaskState>(initialState) {
    private lateinit var taskListUseCase: GetTaskListUseCase
    private val taskMapper = TaskUiModelMapper()

    fun getListTask() = viewModelScope.launch {

    }
}