package com.ericampire.android.demo.compose.ui.home

import androidx.compose.foundation.ScrollableColumn
import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview
import com.ericampire.android.demo.compose.model.User
import com.ericampire.android.demo.compose.navigation.Routing
import com.ericampire.android.demo.compose.testUser
import com.ericampire.android.demo.compose.ui.detail.DetailUserView
import com.github.zsoltk.compose.router.Router

@Composable
fun UserListView(users: List<User>, defaultRouting: Routing) {
    Router(defaultRouting = defaultRouting) { backStack ->
        when (val routing = backStack.last()) {
            is Routing.Home -> {
                ScrollableColumn {
                    users.forEach {
                        ItemUserView(user = it)
                    }
                }
            }
            is Routing.DetailUser -> {
                DetailUserView(user = routing.user)
            }
        }
    }
}

@Preview(showDecoration = true)
@Composable
fun UserListViewPreview() {
    UserListView(users = testUser, Routing.Home)
}