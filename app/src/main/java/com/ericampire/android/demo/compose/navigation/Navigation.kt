package com.ericampire.android.demo.compose.navigation

import androidx.annotation.StringRes
import com.ericampire.android.demo.compose.R

sealed class Screen(val route: String, @StringRes val resourceId: Int) {
    object ListUser : Screen("list-user", R.string.list_user)
    object DetailUser : Screen("detail-user", R.string.detail_user)
}