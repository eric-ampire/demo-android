package com.ericampire.android.demo.compose

import com.ericampire.android.demo.compose.model.*

val eric = User(
    id = 1,
    name = "Eric Ampire"
)

val jonathan = User(
    id = 3,
    name = "Jo Yombo",
)

val esther = User(
    id = 5,
    name = "Esther Kwyngu",
)

val task1 = Task(
    id = 123,
    timeCode = "21.34",
    title = "Contact Page",
    tag = "#Design",
    status = Status.InProgress,
    assignees = listOf(eric),
    attachmentCount = 3,
    commentCount = 4
)

val task2 = Task(
    id = 158,
    title = "Calculator Page",
    timeCode = "12.34",
    tag = "#Design",
    status = Status.Done,
    assignees = listOf(jonathan),
    attachmentCount = 8,
    commentCount = 4
)

val task4 = Task(
    id = 159,
    title = "Calculator Backend",
    timeCode = "45.34",
    tag = "#Backend",
    status = Status.Done,
    assignees = listOf(jonathan, eric),
    attachmentCount = 4,
    commentCount = 6
)

val task3 = Task(
    id = 157,
    title = "Technical Task",
    tag = "#Fontend",
    timeCode = "30.34",
    status = Status.Review,
    assignees = listOf(esther, jonathan),
    attachmentCount = 4,
    commentCount = 8
)

val mockProject = Project(
    id = 1,
    title = "Create additionnal page",
    date = "Dec 12, 2020",
    days = 3,
    status = Status.InProgress,
    users = listOf(esther, eric, jonathan, eric),
    tasks = listOf(task1, task2, task3),
    progress = 0.87f
)