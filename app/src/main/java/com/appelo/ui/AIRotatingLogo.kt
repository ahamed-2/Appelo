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


    val transition =
        rememberInfiniteTransition()



    val rotation by transition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec =
        infiniteRepeatable(
            animation =
            tween(8000),
            repeatMode =
            RepeatMode.Restart
        )
    )


    val pulse by transition.animateFloat(
        initialValue = 50f,
        targetValue = 80f,
        animationSpec =
        infiniteRepeatable(
            animation =
            tween(1500),
            repeatMode =
            RepeatMode.Reverse
        )
    )



    Canvas(

        modifier =
        Modifier
            .size(220.dp)
            .rotate(rotation)

    ){


        drawCircle(

            color =
            Color(0xFF00E5FF),

            radius =
            pulse,

            alpha =
            0.25f

        )


        drawCircle(

            color =
            Color(0xFF007BFF),

            radius =
            55f

        )


        drawCircle(

            color =
            Color.White,

            radius =
            20f

        )

    }

}
