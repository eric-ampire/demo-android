package com.ericampire.android.demo.compose.ui.projectmanagement

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ericampire.android.demo.compose.model.Task
import com.ericampire.android.demo.compose.task1

@Composable
fun TimelineTaskView(task: Task) {

}

@Preview(showSystemUi = true)@Composable
fun TimelineTaskViewPreview() {
    TimelineTaskView(task = task1)
}



