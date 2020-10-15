package com.ericampire.android.demo.compose.model

import androidx.compose.runtime.Immutable

@Immutable
data class User(
    val displayName: String,
    val avatar: String,
    val post: String
)