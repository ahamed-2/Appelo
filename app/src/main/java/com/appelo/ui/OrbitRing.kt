package com.appelo.ui

import androidx.compose.foundation.Canvas
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable
fun OrbitRing(){

    Canvas(
        modifier = Modifier
    ){

        drawCircle(

            color =
            Color(0xFF8A2BE2),

            radius =
            100f,

            style =
            androidx.compose.ui.graphics.drawscope
                .Stroke(4f)

        )

    }
}
