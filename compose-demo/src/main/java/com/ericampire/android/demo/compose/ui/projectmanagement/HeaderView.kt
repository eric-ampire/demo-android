package com.ericampire.android.demo.compose.ui.projectmanagement

import androidx.compose.material.Text
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ericampire.android.demo.compose.mockProject
import com.ericampire.android.demo.compose.model.Project
import com.ericampire.android.demo.compose.style.typography

@Composable
fun HeaderView(project: Project) {
    Column(modifier = Modifier
        .padding(top = 100.dp)
        .padding(horizontal = 20.dp, vertical = 16.dp)) {

        Text(text = project.title, style = typography.h1)
        Row(modifier = Modifier.padding(vertical = 8.dp)) {
            Text(text = "${project.days} days", style = typography.body2)
            Text(text = "|", Modifier.padding(horizontal = 4.dp), style = typography.body2)
            Text(text = project.date, style = typography.body2)
        }

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth(),
            content = {
                AvatarListView(
                    users = project.users,
                    onAddClick = {

                    },
                    onUserClick = { user ->

                    }
                )

                ProjectProgressIndicatorView(
                    modifier = Modifier.size(48.dp),
                    progress = project.progress,
                    status = project.status
                )
            }
        )
    }
}

@Composable
@Preview(showSystemUi = true)
fun HeaderViewPreview() {
    HeaderView(project = mockProject)
}