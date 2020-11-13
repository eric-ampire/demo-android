package com.ericampire.android.demo.compose.ui.projectmanagement

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawShadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview


@Composable
fun AvatarPlusButtonView(modifier: Modifier = Modifier, onAddClick: () -> Unit) {
    Box(
        modifier = modifier
            .drawShadow(5.dp, clip = false, shape = CircleShape)
            .background(Color.White, CircleShape)
            .padding(3.dp)
            .clip(CircleShape)
            .size(40.dp)
            .clickable(onClick = onAddClick),
        alignment = Alignment.Center,
        children = {
            Icon(Icons.Rounded.Add)
        }
    )
}

@Composable
@Preview
fun AvatarPlusButtonViewPreview() {
    AvatarPlusButtonView(onAddClick = {})
}