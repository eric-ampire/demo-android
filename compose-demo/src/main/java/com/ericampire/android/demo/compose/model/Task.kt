package com.ericampire.android.demo.compose.model

data class Task(
    val id: Int,
    val title: String,
    val timeCode: String,
    val tag: String,
    val status: Status,
    val assignees: List<User>,
    val commentCount: Int,
    val attachmentCount: Int
)