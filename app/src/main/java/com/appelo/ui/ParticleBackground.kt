package com.appelo.ui

import androidx.compose.foundation.Canvas
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable
fun ParticleBackground(){


    Canvas(
        modifier =
        Modifier.fillMaxSize()
    ){


        repeat(40){

            drawCircle(

                color =
                Color.Cyan,

                radius =
                3f,

                center =
                androidx.compose.ui.geometry.Offset(

                    x = (0..size.width.toInt())
                        .random()
                        .toFloat(),

                    y = (0..size.height.toInt())
                        .random()
                        .toFloat()

                )
            )
        }
    }
}
