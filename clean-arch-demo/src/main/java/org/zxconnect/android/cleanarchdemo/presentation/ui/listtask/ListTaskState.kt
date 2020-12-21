package org.zxconnect.android.cleanarchdemo.presentation.ui.listtask

import com.airbnb.mvrx.Async
import com.airbnb.mvrx.MavericksState
import com.airbnb.mvrx.Uninitialized
import org.zxconnect.android.cleanarchdemo.domain.entity.TaskUiModel
import org.zxconnect.android.cleanarchdemo.util.Result

data class ListTaskState(
    val task: Async<Result<List<TaskUiModel>>> = Uninitialized
) : MavericksState