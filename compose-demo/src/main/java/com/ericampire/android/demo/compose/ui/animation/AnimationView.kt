package com.ericampire.android.demo.compose.ui.animation

import androidx.compose.animation.ColorPropKey
import androidx.compose.animation.DpPropKey
import androidx.compose.animation.core.estimateAnimationDurationMillis
import androidx.compose.animation.core.transitionDefinition
import androidx.compose.animation.transition
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

enum class StateKey {
    First, Second
}

class Service {

    @Synchronized
    fun getInstance() {

    }
}

@Composable
fun AnimationView() {
    val colorKey = ColorPropKey(label = "color")
    val widthKey = DpPropKey(label = "width")
    val heightKey = DpPropKey(label = "height")

    val transDefinition = transitionDefinition<StateKey> {
        state(StateKey.First) {
            this[colorKey] = Color.Red
            this[widthKey] = 200.dp
            this[heightKey] = 200.dp
        }

        state(StateKey.Second) {
            this[colorKey] = Color.Blue
            this[widthKey] = 400.dp
            this[heightKey] = 400.dp
        }
    }

    val state = transition(
        definition = transDefinition,
        initState = StateKey.First,
        toState = StateKey.Second
    )
    
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier.preferredSize(
                width = state[widthKey],
                height = state[heightKey]
            ).background(color = state[colorKey])
        )
        
        Button(onClick = { state }) {
            
        }
    }
    
    
}