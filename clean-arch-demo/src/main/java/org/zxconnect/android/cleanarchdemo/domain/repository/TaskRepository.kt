package org.zxconnect.android.cleanarchdemo.domain.repository

import org.zxconnect.android.cleanarchdemo.domain.entity.TaskModel

interface TaskRepository {
    suspend fun getTaskList(): List<TaskModel>
    suspend fun insert(taskModel: TaskModel)
    suspend fun update(taskModel: TaskModel)
    suspend fun delete(taskModel: TaskModel)
}