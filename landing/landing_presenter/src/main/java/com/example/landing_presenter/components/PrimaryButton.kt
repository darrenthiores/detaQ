package com.example.landing_presenter.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.core.utils.UiText
import com.example.core_ui.LocalGradient
import com.example.core_ui.ui.theme.DetaQTheme
import com.example.core_ui.ui.theme.Neutral10

@Composable
fun PrimaryButton(
    text: UiText,
    modifier: Modifier = Modifier,
    textModifier: Modifier = Modifier,
    textAlign: TextAlign = TextAlign.Center,
    onClick: () -> Unit,
) {
    val localGradient = LocalGradient.current
    val context = LocalContext.current

    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent,
            contentColor = Neutral10
        ),
        elevation = ButtonDefaults.elevation(
            defaultElevation = 0.dp,
            pressedElevation = 0.dp
        ),
        modifier = modifier
            .background(
                brush = localGradient.primary,
                shape = RoundedCornerShape(8.dp)
            )
    ) {
        Text(
            text = text.asString(context),
            style = MaterialTheme.typography.button,
            modifier = textModifier,
            textAlign = textAlign
        )
    }
}

@Preview
@Composable
fun PrimaryButtonPreview() {
    DetaQTheme {
        PrimaryButton(
            text = UiText.DynamicString("NEXT"),
            textModifier = Modifier
                .fillMaxWidth()
        ) {

        }
    }
}