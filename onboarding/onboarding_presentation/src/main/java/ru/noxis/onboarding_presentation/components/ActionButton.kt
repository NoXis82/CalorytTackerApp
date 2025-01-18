package ru.noxis.onboarding_presentation.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.noxis.core_ui.LocalSpacing

@Composable
fun ActionButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = true,
    textStyle: TextStyle = MaterialTheme.typography.bodyLarge
) {
    TextButton(
        onClick = onClick,
        modifier = modifier,
        enabled = isEnabled,
        shape = RoundedCornerShape(100.dp)
    ) {
        Text(
            text = text,
            style = textStyle,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(LocalSpacing.current.spaceSmall)
        )
    }
}


@Preview
@Composable
private fun ActionButtonPreview() {
    ActionButton(text = "Button", onClick = {})
}