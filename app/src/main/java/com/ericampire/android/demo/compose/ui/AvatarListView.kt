package com.ericampire.android.demo.compose.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ericampire.android.demo.compose.model.User

@Composable
fun AvatarListView(
    modifier: Modifier = Modifier,
    users: List<User>,
    onAddClick: () -> Unit = {},
    onUserClick: (User) -> Unit = {},
    showAvatarPlusButton: Boolean = true
) {
    Row(modifier = modifier) {
        users.forEachIndexed { index, user ->
            AvatarView(
                user = user,
                modifier = Modifier.offset(x = if (index != 0) (-10 * index).dp else 0.dp),
                onUserClick = onUserClick
            )
        }

        if (showAvatarPlusButton) {
            AvatarPlusButtonView(
                onAddClick = onAddClick,
                modifier = Modifier.offset(x = (-10 * users.size).dp)
            )
        }
    }
}