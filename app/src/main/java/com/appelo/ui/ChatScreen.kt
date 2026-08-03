package com.appelo.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun ChatScreen() {

    var text by remember {
        mutableStateOf("")
    }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {


        Text(
            text = "Appelo AI 🤖",
            style = MaterialTheme.typography.headlineMedium
        )


        Spacer(
            modifier = Modifier.height(20.dp)
        )


        OutlinedTextField(
            value = text,
            onValueChange = {
                text = it
            },
            label = {
                Text("Ask Appelo")
            }
        )


        Button(
            onClick = {

            }
        ) {

            Text("Send")

        }
    }
}
