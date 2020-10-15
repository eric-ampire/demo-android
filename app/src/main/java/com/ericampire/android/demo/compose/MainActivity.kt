package com.ericampire.android.demo.compose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Providers
import androidx.compose.ui.platform.setContent
import com.ericampire.android.demo.compose.navigation.Routing
import com.ericampire.android.demo.compose.style.DemoComposeTheme
import com.ericampire.android.demo.compose.ui.home.UserListView
import com.github.zsoltk.compose.backpress.AmbientBackPressHandler
import com.github.zsoltk.compose.backpress.BackPressHandler

class MainActivity : AppCompatActivity() {
    private val backPressHandler = BackPressHandler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Providers(AmbientBackPressHandler provides backPressHandler) {
                DemoComposeTheme(darkTheme = false) {
                    UserListView(users = testUser, Routing.Home)
                }
            }
        }
    }

    override fun onBackPressed() {
        if (!backPressHandler.handle()) {
            super.onBackPressed()
        }
    }
}