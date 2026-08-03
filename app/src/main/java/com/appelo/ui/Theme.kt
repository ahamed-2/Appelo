package com.appelo.ui

import androidx.compose.material3.*
import androidx.compose.runtime.Composable


@Composable
fun AppeloTheme(
    content: @Composable () -> Unit
){

    MaterialTheme(

        colorScheme =
            darkColorScheme(),

        content = content

    )
}
