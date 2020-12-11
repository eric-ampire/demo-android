package com.ericampire.android.demo.compose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.ui.platform.setContent
import com.ericampire.android.demo.compose.style.DemoComposeTheme
import com.ericampire.android.demo.compose.ui.projectmanagement.TimelineScreenView


class MainActivity : AppCompatActivity() {
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DemoComposeTheme {
                TimelineScreenView(project = mockProject)
            }
        }
    }
}

