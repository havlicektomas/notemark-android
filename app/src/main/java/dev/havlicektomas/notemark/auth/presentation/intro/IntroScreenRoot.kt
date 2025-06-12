package dev.havlicektomas.notemark.auth.presentation.intro

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.window.core.layout.WindowWidthSizeClass
import dev.havlicektomas.notemark.R
import dev.havlicektomas.notemark.core.presentation.designsystem.components.NoteMarkButton
import dev.havlicektomas.notemark.core.presentation.designsystem.components.NoteMarkOutlinedButton
import dev.havlicektomas.notemark.core.presentation.designsystem.theme.NoteMarkLightBlue
import dev.havlicektomas.notemark.core.presentation.designsystem.theme.NoteMarkTheme
import dev.havlicektomas.notemark.core.presentation.designsystem.theme.blueWhiteHorizontalGradient
import dev.havlicektomas.notemark.core.presentation.designsystem.theme.blueWhiteVerticalGradient

@Composable
fun IntroScreenRoot() {
    IntroScreen()
}

@Composable
fun IntroScreen() {
    val windowClass = currentWindowAdaptiveInfo().windowSizeClass

    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
    ) { innerPadding ->
        val gradient = if (windowClass.windowWidthSizeClass == WindowWidthSizeClass.COMPACT) {
            MaterialTheme.colorScheme.blueWhiteVerticalGradient
        } else {
            SolidColor(NoteMarkLightBlue)
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(gradient),
        ) {
            Image(
                painter = painterResource(R.drawable.intro_bkg),
                contentDescription = null,
                modifier = if (windowClass.windowWidthSizeClass == WindowWidthSizeClass.COMPACT) {
                    Modifier.fillMaxWidth()
                } else {
                    Modifier
                        .fillMaxHeight()
                        .width(500.dp)
                },
                contentScale = ContentScale.FillWidth
            )

            val portraitModifier = Modifier
                .fillMaxWidth()
                .padding(innerPadding)
                .align(Alignment.BottomCenter)

            val landscapeModifier = Modifier
                .width(450.dp)
                .padding(innerPadding)
                .align(Alignment.CenterEnd)

            Box(
                modifier = if (windowClass.windowWidthSizeClass == WindowWidthSizeClass.COMPACT) {
                    portraitModifier
                } else {
                    landscapeModifier
                }
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(
                            if (windowClass.windowWidthSizeClass == WindowWidthSizeClass.COMPACT) {
                                RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)
                            } else {
                                RoundedCornerShape(topStart = 20.dp, bottomStart = 20.dp)
                            }
                        )
                        .background(MaterialTheme.colorScheme.background)
                        .padding(horizontal = 16.dp)
                        .padding(vertical = 24.dp)
                ) {
                    Text(
                        text = "Your Own Collection of Notes",
                        style = MaterialTheme.typography.titleLarge
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "Capture your thoughts and ideas.",
                        style = MaterialTheme.typography.titleSmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    Spacer(modifier = Modifier.height(32.dp))
                    NoteMarkButton(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Get Started",
                        onClick = {}
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    NoteMarkOutlinedButton(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Log In",
                        onClick = {}
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun IntroScreenPreview() {
    NoteMarkTheme {
        IntroScreen()
    }
}