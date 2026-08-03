package com.appelo.ui

import androidx.compose.foundation.Canvas
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color


@Composable
fun AssistantOrb(
    modifier: Modifier = Modifier
){


    Canvas(
        modifier = modifier
    ){

        drawCircle(
            color = Color.Blue,
            radius = 80f,
            center = Offset(
                center.x,
                center.y
            )
        )

    }
}
