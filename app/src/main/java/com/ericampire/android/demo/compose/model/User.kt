package com.ericampire.android.demo.compose.model

data class User(val id: Int, val name: String) {
    fun imageForSize(size: Int): String {
        return "https://i.pravatar.cc/$size?img=$id"
    }
}