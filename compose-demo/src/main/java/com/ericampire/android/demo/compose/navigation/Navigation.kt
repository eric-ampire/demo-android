package com.ericampire.android.demo.compose.navigation

import androidx.annotation.StringRes
import com.ericampire.android.demo.compose.R

sealed class Screen(val route: String, @StringRes val resourceId: Int) {
    object HomeView : Screen("home", R.string.txt_home)
    object ProjectManagerView : Screen("project_manager", R.string.txt_project_management)
    object AnimationView : Screen("animation", R.string.txt_animation)
}