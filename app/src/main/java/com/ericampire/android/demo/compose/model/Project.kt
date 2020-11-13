package com.ericampire.android.demo.compose.model

data class Project(
    val id: Int,
    val title: String,
    val date: String,
    val progress: Float,
    val days: Int,
    val status: Status,
    val users: List<User>,
    val tasks: List<Task>
)