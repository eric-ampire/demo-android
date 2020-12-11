package com.ericampire.android.demo.compose.ui.projectmanagement

import androidx.compose.material.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import com.ericampire.android.demo.compose.model.Task
import com.ericampire.android.demo.compose.style.darkBlue
import com.ericampire.android.demo.compose.style.typography
import com.ericampire.android.demo.compose.task1

@Composable
fun TaskCardView(task: Task, modifier: Modifier = Modifier) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        TaskLine(task, modifier = Modifier.fillMaxHeight())
        Card(
            shape = RoundedCornerShape(18.dp),
            modifier = modifier.padding(8.dp),
            elevation = 16.dp,
            content = {
                Column(modifier = Modifier.padding(20.dp)) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth(),
                        content = {
                            Text(
                                text = "${task.status}",
                                style = typography.h3,
                                color = task.status.color
                            )
                            Text(text = task.tag, style = typography.h3, color = Color.LightGray)
                        }
                    )

                    Text(text = task.title, style = typography.h2)

                    Row(
                        modifier = Modifier.padding(vertical = 10.dp).fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        content = {
                            Row {
                                LabeledIcon(
                                    label = "${task.commentCount}",
                                    icon = Icons.Rounded.ChatBubbleOutline
                                )
                                Spacer(modifier = Modifier.padding(10.dp))
                                LabeledIcon(
                                    label = "${task.attachmentCount}",
                                    icon = Icons.Rounded.Attachment
                                )
                            }

                            TaskAssignees(task = task)
                        }
                    )
                }
            }
        )
    }
}


@Composable
fun TaskLine(task: Task, modifier: Modifier = Modifier) {
    val dividerModifier = Modifier
        .width(3.dp)
        .height(75.dp)
        .background(Color.White)

    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        content= {
            Text(
                text = task.timeCode,
                color = darkBlue,
                style = typography.h3,
                modifier = Modifier.padding(horizontal = 10.dp)
            )
            Column(
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally,
                content = {
                    Divider(modifier = dividerModifier)
                    Box(
                        modifier = Modifier
                            .background(color = Color.White, shape = CircleShape)
                            .border(2.dp, color = task.status.color, shape = CircleShape)
                            .size(16.dp)
                    )
                    Divider(modifier = dividerModifier)
                }
            )
        }
    )
}



@Preview(showSystemUi = true)
@Composable
fun TaskLinePreview() {
    TaskLine(task = task1)
}

@Preview(showSystemUi = true)
@Composable
fun TaskCardViewPreview() {
    TaskCardView(task = task1)
}