package com.appelo.settings


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp



@Composable
fun ApiSettingsScreen(
    onSave: (String)->Unit
){


    var apiKey by remember {

        mutableStateOf("")

    }



    Column(

        modifier =
        Modifier
            .fillMaxSize()
            .padding(20.dp)

    ){


        Text(
            text = "Gemini API Key",
            style =
            MaterialTheme.typography.headlineSmall
        )


        Spacer(
            modifier =
            Modifier.height(20.dp)
        )



        OutlinedTextField(

            value = apiKey,

            onValueChange = {

                apiKey = it

            },

            label = {

                Text("Enter API Key")

            }

        )



        Spacer(
            modifier =
            Modifier.height(20.dp)
        )



        Button(

            onClick = {

                onSave(apiKey)

            }

        ){

            Text(
                "Save Key"
            )

        }

    }
}
