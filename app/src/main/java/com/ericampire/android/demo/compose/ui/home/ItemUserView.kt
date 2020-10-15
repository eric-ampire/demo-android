package com.ericampire.android.demo.compose.ui.home

import androidx.compose.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.clickable
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
import com.ericampire.android.demo.compose.testUser

@Composable
fun ItemUserView(user: User) {
    val columnModifier = Modifier
        .fillMaxWidth()
        .padding(start = 16.dp)


    val imageModifier = Modifier
        .size(70.dp)
        .clip(RoundedCornerShape(8.dp))

    val rowModifier = Modifier
        .fillMaxWidth()
        .clickable(onClick = {  })
        .padding(16.dp)

    Row(modifier = rowModifier) {
        Image(
            asset = imageResource(id = R.drawable.profile),
            modifier = imageModifier
        )
        
        Column(modifier = columnModifier) {
            Text(
                text = user.displayName,
                style = TextStyle(
                    fontSize = 21.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Text(text = user.post)
        }
    }
}

@Preview(showDecoration = true)
@Composable
fun ItemUserViewPreview() {
    ItemUserView(testUser.first())
}