package org.zxconnect.android.cleanarchdemo.domain.mapper

import android.os.Build
import androidx.annotation.RequiresApi
import org.zxconnect.android.cleanarchdemo.domain.entity.TaskModel
import org.zxconnect.android.cleanarchdemo.domain.entity.TaskUiModel
import java.time.format.DateTimeFormatter

class TaskUiModelMapper : Mapper<TaskModel, TaskUiModel> {

    @RequiresApi(Build.VERSION_CODES.O)
    private val dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")

    @RequiresApi(Build.VERSION_CODES.O)
    override fun map(t: TaskModel): TaskUiModel {
        return TaskUiModel(
            title = t.title,
            description = t.description,
            dueDate = dateFormatter.format(t.dueDate.toInstant()),
            status = t.status.toString()
        )
    }
}