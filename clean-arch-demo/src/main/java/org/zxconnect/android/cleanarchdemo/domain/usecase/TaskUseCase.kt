package org.zxconnect.android.cleanarchdemo.domain.usecase

import android.util.Log
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.zxconnect.android.cleanarchdemo.domain.entity.TaskModel
import org.zxconnect.android.cleanarchdemo.domain.repository.TaskRepository
import org.zxconnect.android.cleanarchdemo.util.Result

class UpdateTaskUseCase(private val taskRepository: TaskRepository) {
    suspend fun execute(taskModel: TaskModel): Flow<Result<Unit>> = flow {
        try {
            emit(Result.Loading)
            emit(Result.Success(taskRepository.update(taskModel)))
        } catch (e: Exception) {
            Log.e("ericampire", e.localizedMessage)
            emit(Result.Error(e))
        }
    }
}

class InsertTaskUseCase(private val taskRepository: TaskRepository) {
    suspend fun execute(taskModel: TaskModel): Flow<Result<Unit>> = flow {
        try {
            emit(Result.Loading)
            emit(Result.Success(taskRepository.insert(taskModel)))
        } catch (e: Exception) {
            Log.e("ericampire", e.localizedMessage)
            emit(Result.Error(e))
        }
    }
}


class GetTaskListUseCase(private val taskRepository: TaskRepository) {
    suspend fun execute(): Flow<Result<List<TaskModel>>> = flow {
        try {
            emit(Result.Loading)
            emit(Result.Success(taskRepository.getTaskList()))
        } catch (e: Exception) {
            Log.e("ericampire", e.localizedMessage)
            emit(Result.Error(e))
        }
    }
}

class DeleteTaskUseCase(private val taskRepository: TaskRepository) {
    suspend fun execute(taskModel: TaskModel): Flow<Result<Unit>> = flow {
        try {
            emit(Result.Loading)
            emit(Result.Success(taskRepository.delete(taskModel)))
        } catch (e: Exception) {
            Log.e("ericampire", e.localizedMessage)
            emit(Result.Error(e))
        }
    }
}