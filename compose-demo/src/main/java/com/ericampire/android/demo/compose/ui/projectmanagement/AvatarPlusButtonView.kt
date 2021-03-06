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
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun AvatarPlusButtonView(modifier: Modifier = Modifier, onAddClick: () -> Unit) {
    Box(
        modifier = modifier
            .shadow(5.dp, clip = false, shape = CircleShape)
            .background(Color.White, CircleShape)
            .padding(3.dp)
            .clip(CircleShape)
            .size(40.dp)
            .clickable(onClick = onAddClick),
        contentAlignment = Alignment.Center,
        content = {
            Icon(Icons.Rounded.Add)
        }
    )
}

@Composable
@Preview
fun AvatarPlusButtonViewPreview() {
    AvatarPlusButtonView(onAddClick = {})
}