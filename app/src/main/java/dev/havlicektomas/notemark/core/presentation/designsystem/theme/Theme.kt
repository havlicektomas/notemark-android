package dev.havlicektomas.notemark.core.presentation.designsystem.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = NoteMarkBlue,
    secondary = NoteMarkBlueOpacity10,
    background = Color.White,
    surface = LightGray,
    surfaceVariant = DarkGrayOpacity12,
    onPrimary = Color.White,
    onSecondary = DarkGray,
    onBackground = DarkGray,
    onSurface = DarkGray,
    onSurfaceVariant = Gray
)

@Composable
fun NoteMarkTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = Typography,
        content = content
    )
}