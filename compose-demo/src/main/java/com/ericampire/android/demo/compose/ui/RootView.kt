package com.ericampire.android.demo.compose.ui

import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.ericampire.android.demo.compose.mockProject
import com.ericampire.android.demo.compose.navigation.Screen
import com.ericampire.android.demo.compose.ui.animation.AnimationView
import com.ericampire.android.demo.compose.ui.projectmanagement.TimelineScreenView

@Composable
fun RootView() {
    val navController = rememberNavController()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Home") },
                navigationIcon = {
                    Icon(imageVector = Icons.Rounded.Menu)
                },
                actions = {

                }
            )
        },
        bodyContent = {
            NavHost(
                navController = navController,
                startDestination = Screen.HomeView.route,
                builder = {
                    composable(route = "home") {
                        HomeView(navController = navController)
                    }
                    composable(route = "project-manager") {
                        TimelineScreenView(project = mockProject)
                    }
                    composable(route = "animation") {
                        AnimationView()
                    }
                }
            )
        }
    )
}

@Composable
fun HomeView(navController: NavController) {
    ScrollableColumn(
        modifier = Modifier.fillMaxSize().padding(10.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
        content = {
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    navController.navigate("project-manager")
                },
                content = {
                    Text(text = "Project Management")
                }
            )

            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    navController.navigate("project-manager")
                },
                content = {
                    Text(text = "Food Recipe")
                }
            )

            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    navController.navigate("animation")
                },
                content = {
                    Text(text = "Animation")
                }
            )
        }
    )
}