package com.example.useractivity.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.useractivity.R


val Mouse = FontFamily(
    Font(R.font.mouse_regular, FontWeight.Bold),
)

val Englebert = FontFamily(
    Font(R.font.englebert_regular, FontWeight.Normal)

)
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = Englebert,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    displayLarge = TextStyle(
        fontFamily = Mouse,
        fontWeight = FontWeight.Normal,
        fontSize = 35.sp
    ),
    displayMedium = TextStyle(
        fontFamily = Mouse,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp
    )
)