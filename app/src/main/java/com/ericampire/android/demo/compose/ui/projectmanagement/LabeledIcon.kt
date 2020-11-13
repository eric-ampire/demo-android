package com.ericampire.android.demo.compose.ui.projectmanagement

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AttachEmail
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.ericampire.android.demo.compose.style.darkBlue
import com.ericampire.android.demo.compose.style.typography

@Composable
fun LabeledIcon(label: String, icon: VectorAsset) {
    Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
        Icon(
            asset = icon,
            tint = Color.LightGray,
            modifier = Modifier.padding(end = 8.dp)
        )
        Text(text = label, color = darkBlue, style = typography.h3)
    }
}

@Preview
@Composable
fun LabeledIconPreview() {
    LabeledIcon(label = "3", icon = Icons.Rounded.AttachEmail)
}