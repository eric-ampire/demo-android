package org.zxconnect.android.cleanarchdemo.domain.entity

import java.util.*

data class TaskModel(
    val id: Long,
    val title: String,
    val description: String,
    val dueDate: Date,
    val status: TaskStatus
)

data class TaskUiModel(
    val title: String,
    val description: String,
    val dueDate: String,
    val status: String
)

enum class TaskStatus {
    OPEN,
    PROGRESS,
    BLOCKED,
    IN_REVIEW,
    CLOSED;

    override fun toString(): String {
        return when(this) {
            OPEN -> "Open"
            PROGRESS -> "In Progress"
            BLOCKED -> "Blocked"
            IN_REVIEW -> "In Review"
            CLOSED -> "Closed"
        }
    }
}