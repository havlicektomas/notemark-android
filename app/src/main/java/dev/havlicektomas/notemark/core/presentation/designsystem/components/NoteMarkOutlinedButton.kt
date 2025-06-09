package dev.havlicektomas.notemark.core.presentation.designsystem.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.havlicektomas.notemark.core.presentation.designsystem.theme.NoteMarkTheme

@Composable
fun NoteMarkOutlinedButton(
    modifier: Modifier = Modifier,
    text: String,
    enabled: Boolean = true,
    onClick: () -> Unit
) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(
            width = 1.dp,
            brush = SolidColor(MaterialTheme.colorScheme.primary)
        ),
    ) {
        Text(
            text = text,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun NoteMarkOutlinedButtonPreview() {
    NoteMarkTheme {
        NoteMarkOutlinedButton(
            modifier = Modifier.padding(16.dp),
            text = "Click Me",
            enabled = true,
            onClick = {}
        )
    }
}