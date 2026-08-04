package com.appelo.ui

import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun VoiceWaveform(){


    val animation =
        rememberInfiniteTransition()



    val height by animation.animateFloat(

        20f,

        80f,

        infiniteRepeatable(

            animation =
            tween(700),

            repeatMode =
            RepeatMode.Reverse

        )

    )



    Canvas(

        modifier =
        Modifier.size(180.dp)

    ){


        drawLine(

            color =
            Color.Cyan,

            start =
            androidx.compose.ui.geometry.Offset(
                size.width/2,
                size.height/2-height
            ),

            end =
            androidx.compose.ui.geometry.Offset(
                size.width/2,
                size.height/2+height
            ),

            strokeWidth =
            8f

        )

    }

}
