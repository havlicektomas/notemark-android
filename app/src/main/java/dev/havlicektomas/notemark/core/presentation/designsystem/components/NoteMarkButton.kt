package dev.havlicektomas.notemark.core.presentation.designsystem.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.havlicektomas.notemark.core.presentation.designsystem.theme.NoteMarkTheme

@Composable
fun NoteMarkButton(
    modifier: Modifier = Modifier,
    text: String,
    enabled: Boolean = true,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(
            contentColor = MaterialTheme.colorScheme.onPrimary,
            containerColor = MaterialTheme.colorScheme.primary,
            disabledContainerColor = MaterialTheme.colorScheme.surfaceVariant,
            disabledContentColor = MaterialTheme.colorScheme.onSurfaceVariant
        )
    ) {
        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {
            leadingIcon?.let {
                it.invoke()
                Spacer(modifier = Modifier.padding(end = 8.dp))
            }
            Text(
                text = text,
            )
            trailingIcon?.let {
                Spacer(modifier = Modifier.padding(start = 8.dp))
                it.invoke()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun NoteMarkButtonPreview() {
    NoteMarkTheme {
        NoteMarkButton(
            modifier = Modifier.padding(16.dp),
            text = "Click Me",
            enabled = true,
            onClick = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun NoteMarkButtonLeadingIconPreview() {
    NoteMarkTheme {
        NoteMarkButton(
            modifier = Modifier.padding(16.dp),
            text = "Click Me",
            enabled = true,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.MailOutline,
                    contentDescription = null
                )
            },
            onClick = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun NoteMarkButtonTrailingIconPreview() {
    NoteMarkTheme {
        NoteMarkButton(
            modifier = Modifier.padding(16.dp),
            text = "Click Me",
            enabled = true,
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.MailOutline,
                    contentDescription = null
                )
            },
            onClick = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun NoteMarkButtonLeadingIcoDisabledPreview() {
    NoteMarkTheme {
        NoteMarkButton(
            modifier = Modifier.padding(16.dp),
            text = "Click Me",
            enabled = false,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.MailOutline,
                    contentDescription = null
                )
            },
            onClick = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun NoteMarkButtonTrailingIconDisabledPreview() {
    NoteMarkTheme {
        NoteMarkButton(
            modifier = Modifier.padding(16.dp),
            text = "Click Me",
            enabled = false,
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.MailOutline,
                    contentDescription = null
                )
            },
            onClick = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun NoteMarkButtonDisabledPreview() {
    NoteMarkTheme {
        NoteMarkButton(
            modifier = Modifier.padding(16.dp),
            text = "Click Me",
            enabled = false,
            onClick = {}
        )
    }
}