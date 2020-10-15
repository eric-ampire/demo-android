package com.ericampire.android.demo.compose.ui.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.ui.tooling.preview.Preview
import com.ericampire.android.demo.compose.R
import com.ericampire.android.demo.compose.model.User
import com.ericampire.android.demo.compose.style.DemoComposeTheme
import com.ericampire.android.demo.compose.testUser

@Composable
fun DetailUserView(user: User) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            asset = imageResource(id = R.drawable.profile),
            modifier = Modifier
                .preferredSize(100.dp)
                .align(Alignment.CenterHorizontally)
                .clip(RoundedCornerShape(16.dp))
        )

        Text(
            text = user.displayName,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 16.dp),
            style = TextStyle(
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )
        )

        Text(
            text = user.post,
            modifier = Modifier.align(Alignment.CenterHorizontally),
        )
    }
}

@Preview
@Composable
fun DetailUserViewPreview() {
    DemoComposeTheme {
        DetailUserView(user = testUser.first())
    }
}