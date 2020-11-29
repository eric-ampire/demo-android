package com.ericampire.android.demo.compose.ui.foodrecipe

import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import kotlinx.coroutines.launch
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Divider
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import dev.chrisbanes.accompanist.insets.AmbientWindowInsets
import dev.chrisbanes.accompanist.insets.statusBarsPadding
import dev.chrisbanes.accompanist.insets.systemBarsPadding


@ExperimentalMaterialApi
@Composable
fun RootView() {

    val insets = AmbientWindowInsets.current

    val scope = rememberCoroutineScope()
    val selection = remember { mutableStateOf(1) }
    val scaffoldState = rememberBackdropScaffoldState(BackdropValue.Concealed)
    BackdropScaffold(
        scaffoldState = scaffoldState,
        appBar = {
            TopAppBar(
                modifier = Modifier.statusBarsPadding(),
                title = { Text("Backdrop scaffold") },
                navigationIcon = {
                    if (scaffoldState.isConcealed) {
                        IconButton(onClick = { scaffoldState.reveal() }) {
                            Icon(Icons.Default.Menu)
                        }
                    } else {
                        IconButton(onClick = { scaffoldState.conceal() }) {
                            Icon(Icons.Default.Close)
                        }
                    }
                },
                actions = {
                    val clickCount = remember { mutableStateOf(0) }
                    IconButton(
                        onClick = {
                            // show snackbar as a suspend function
                            scope.launch {
                                scaffoldState.snackbarHostState
                                    .showSnackbar("Snackbar #${clickCount}")
                            }
                        }
                    ) {
                        Icon(Icons.Default.Favorite)
                    }
                },
                elevation = 0.dp,
                backgroundColor = Color.Transparent
            )
        },
        backLayerContent = {
            LazyColumnFor((1..5).toList()) {
                ListItem(
                    Modifier.clickable {
                        selection.value = it
                        scaffoldState.conceal()
                    },
                    text = { Text("Select $it") }
                )
            }
        },
        frontLayerContent = {
            Box(
                Modifier.fillMaxSize(),
                alignment = Alignment.Center
            ) {
                Text("Selection: ${selection.value}")
            }
        }
    )
}

@ExperimentalMaterialApi
@Preview(showDecoration = false)
@Composable
fun RootViewPreview() {
    RootView()
}