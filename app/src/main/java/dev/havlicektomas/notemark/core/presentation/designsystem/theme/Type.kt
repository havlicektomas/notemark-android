package dev.havlicektomas.notemark.core.presentation.designsystem.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import dev.havlicektomas.notemark.R

val Inter = FontFamily(
    Font(
        resId = R.font.inter_18pt_regular,
        weight = FontWeight.Normal
    ),
    Font(
        resId = R.font.inter_18pt_bold,
        weight = FontWeight.Bold
    ),
    Font(
        resId = R.font.inter_18pt_medium,
        weight = FontWeight.Medium
    )
)

val SpaceGrotesk = FontFamily(
    Font(
        resId = R.font.space_grotesk_regular,
        weight = FontWeight.Normal
    ),
    Font(
        resId = R.font.space_grotesk_bold,
        weight = FontWeight.Bold
    ),
    Font(
        resId = R.font.space_grotesk_medium,
        weight = FontWeight.Medium
    )
)

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.Normal,
        fontSize = 17.sp,
        lineHeight = 24.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.Medium,
        fontSize = 15.sp,
        lineHeight = 20.sp,
    ),
    bodySmall = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
        lineHeight = 20.sp,
    ),
    titleLarge = TextStyle(
        fontFamily = SpaceGrotesk,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp,
        lineHeight = 36.sp,
    ),
    titleSmall = TextStyle(
        fontFamily = SpaceGrotesk,
        fontWeight = FontWeight.Medium,
        fontSize = 17.sp,
        lineHeight = 24.sp,
    ),
    headlineLarge = TextStyle(
        fontFamily = SpaceGrotesk,
        fontWeight = FontWeight.Bold,
        fontSize = 36.sp,
        lineHeight = 40.sp,
    )
)