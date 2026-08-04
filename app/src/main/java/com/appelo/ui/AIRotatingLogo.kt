package com.appelo.ui

import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun AIRotatingLogo(){


    val rotation by rememberInfiniteTransition()
        .animateFloat(
            0f,
            360f,
            infiniteRepeatable(
                tween(6000),
                RepeatMode.Restart
            )
        )


    Canvas(

        modifier =
        Modifier
            .size(180.dp)
            .rotate(rotation)

    ){


        drawCircle(

            color =
            Color.Cyan,

            radius =
            70f

        )


        drawCircle(

            color =
            Color.Blue,

            radius =
            50f

        )

    }

}
