package com.ericampire.android.demo.compose.ui.projectmanagement

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawShadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.DensityAmbient
import androidx.compose.ui.unit.dp
import com.ericampire.android.demo.compose.model.User
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun AvatarView(
    user: User,
    modifier: Modifier = Modifier,
    onUserClick: (User) -> Unit
) {

    CoilImage(
        data = user.imageForSize(with(DensityAmbient.current) { 40.dp.toIntPx() }),
        modifier = modifier
            .drawShadow(5.dp, clip = false, shape = CircleShape)
            .background(Color.White, CircleShape)
            .padding(3.dp)
            .clip(CircleShape)
            .size(40.dp)
            .clickable(onClick = { onUserClick(user) }),
        loading = {
            CircularProgressIndicator()
        }
    )
}