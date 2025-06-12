package dev.havlicektomas.notemark.core.presentation.designsystem.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

// Brand
val NoteMarkBlue = Color(0xFF5977F7)
val NoteMarkBlueOpacity10 = NoteMarkBlue.copy(alpha = 0.1f)
val NoteMarkLightBlue = Color(0xFFE0EAFF)
val WhiteOpacity12 = Color.White.copy(alpha = 0.12f)

// Scheme
val DarkGray = Color(0xFF1B1B1C)
val DarkGrayOpacity12 = DarkGray.copy(alpha = 0.12f)
val Gray = Color(0xFF535364)
val LightGray = Color(0xFFEFEFF2)
val ErrorRed = Color(0xFFE1294B)

// Gradients
val ColorScheme.blueWhiteVerticalGradient: Brush
    get() = Brush.verticalGradient(
        listOf(
            NoteMarkLightBlue,
            Color.White,
        )
    )

val ColorScheme.blueWhiteHorizontalGradient: Brush
    get() = Brush.horizontalGradient(
        listOf(
            NoteMarkLightBlue,
            Color.White,
        )
    )