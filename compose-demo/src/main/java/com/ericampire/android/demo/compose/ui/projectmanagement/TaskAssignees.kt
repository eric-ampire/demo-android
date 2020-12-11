package com.ericampire.android.demo.compose.ui.projectmanagement

import androidx.compose.material.Text
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ericampire.android.demo.compose.model.Task
import com.ericampire.android.demo.compose.style.darkBlue
import com.ericampire.android.demo.compose.style.typography
import com.ericampire.android.demo.compose.task4

@Composable
fun TaskAssignees(task: Task) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = "N\u00B0${task.id}",
            style = typography.h3,
            color = darkBlue,
            modifier = Modifier.padding(end = 8.dp)
        )
        AvatarListView(
            users = task.assignees,
            showAvatarPlusButton = false
        )
    }
}

@Composable
@Preview(device = Devices.PIXEL_4)
fun TaskAssigneesPreview() {
    TaskAssignees(task = task4)
}