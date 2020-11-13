package com.ericampire.android.demo.compose.ui.projectmanagement

import androidx.compose.foundation.ScrollableColumn
import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview
import com.ericampire.android.demo.compose.mockProject
import com.ericampire.android.demo.compose.model.Project

@Preview(showBackground = true)
@Composable
fun TimelineScreenViewPreview() {
    TimelineScreenView(project = mockProject)
}


@Composable
fun TimelineScreenView(project: Project) {
    ScrollableColumn {
        HeaderView(project = project)
        TimelineTaskListView(tasks = project.tasks)
    }
}