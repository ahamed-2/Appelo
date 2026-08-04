package com.appelo.ui


import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


@Composable
fun FuturisticButton(
    text:String
){

    Button(

        onClick = {},

        colors =
        ButtonDefaults.buttonColors(

            containerColor =
            Color(0xFF101B40)

        )

    ){

        Text(
            text = text,
            color = Color.Cyan
        )

    }
}
