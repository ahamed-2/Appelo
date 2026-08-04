package com.appelo.ui

import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp


@Composable
fun OrbitRing(){


    val rotation by rememberInfiniteTransition()
        .animateFloat(
            0f,
            360f,
            infiniteRepeatable(
                tween(5000)
            )
        )


    Canvas(

        modifier =
        Modifier
            .size(260.dp)
            .rotate(rotation)

    ){


        drawCircle(

            color =
            Color(0xFF8A2BE2),

            radius =
            120f,

            style =
            Stroke(
                width = 3f
            )

        )


        drawCircle(

            color =
            Color.Cyan,

            radius =
            140f,

            style =
            Stroke(
                width = 2f
            )

        )

    }

}
