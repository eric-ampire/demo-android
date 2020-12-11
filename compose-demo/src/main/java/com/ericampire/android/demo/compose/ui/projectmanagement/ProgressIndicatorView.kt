package com.ericampire.android.demo.compose.ui.projectmanagement

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ericampire.android.demo.compose.model.Status
import com.ericampire.android.demo.compose.style.typography
import kotlin.math.roundToInt

@Composable
fun ProjectProgressIndicatorView(progress: Float, status: Status, modifier: Modifier = Modifier) {
    val progressText = "${(progress * 100).roundToInt()}%"
    Box(
        modifier = modifier.border(
            width = 3.dp,
            shape = CircleShape,
            color = status.color.copy(alpha = 0.3f)
        ),
        contentAlignment = Alignment.Center,
        content = {
            CircularProgressIndicator(
                modifier = modifier,
                progress = progress,
                color = status.color,
                strokeWidth = 2.5.dp
            )
            Text(
                text = progressText,
                color = status.color,
                style = typography.body2
            )
        }
    )
}

@Composable
@Preview
fun ProgressIndicatorViewPreview() {
    ProjectProgressIndicatorView(0.60f, Status.New)
}