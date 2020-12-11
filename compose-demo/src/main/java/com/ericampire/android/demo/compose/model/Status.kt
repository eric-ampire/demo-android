package com.ericampire.android.demo.compose.model

import androidx.compose.ui.graphics.Color

enum class Status(val color: Color, private val title: String) {
    Review(Color.Red, "Review"),
    New(Color(0xFF2CC09C), "New"),
    InProgress(Color(0xFFF26250), "In Progress"),
    Done(Color(0xFF5A55Ca), "Done");

    override fun toString(): String {
        return title
    }
}