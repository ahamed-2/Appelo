package com.appelo.ui

import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color


@Composable
fun VoiceWave(
    modifier: Modifier = Modifier
) {


    val infinite =
        rememberInfiniteTransition()


    val size by infinite.animateFloat(
        initialValue = 20f,
        targetValue = 60f,
        animationSpec =
            infiniteRepeatable(
                animation =
                tween(1000),
                repeatMode =
                RepeatMode.Reverse
            )
    )


    Canvas(
        modifier = modifier
    ){

        drawCircle(
            color = Color.Cyan,
            radius = size,
            center = Offset(
                center.x,
                center.y
            )
        )
    }
}
