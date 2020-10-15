package com.ericampire.android.demo.compose.navigation

import com.ericampire.android.demo.compose.model.User

sealed class Routing {
    object Home : Routing()
    data class DetailUser(val user: User) : Routing()
}