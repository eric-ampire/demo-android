package com.ericampire.android.demo.compose.style

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    body2 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        letterSpacing = 0.25.sp,
        color = Color.LightGray
    ),
    h1 = TextStyle(
        fontSize = 36.sp,
        fontWeight = FontWeight.Bold
    ),
    h3 = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold
    ),
    h2 = TextStyle(
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold
    ),
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
)