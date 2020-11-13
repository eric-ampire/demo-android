package com.ericampire.android.demo.compose.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.ericampire.android.demo.compose.model.Task

@Composable
fun TimelineTaskListView(tasks: List<Task>) {
    Column(
        modifier = Modifier.background(Color(0xFFF1F5FE), RoundedCornerShape(topLeft = 40.dp))
            .fillMaxSize()
            .padding(top = 40.dp),
        children = {
            tasks.forEachIndexed { index, task ->
                TaskCardView(task = task)
            }
        }
    )
}