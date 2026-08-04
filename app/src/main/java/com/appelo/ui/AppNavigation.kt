package com.appelo.ui

import androidx.compose.runtime.*
import androidx.compose.material3.*


@Composable
fun AppNavigation(){


    var screen by remember {
        mutableStateOf("home")
    }


    when(screen){


        "home" -> {

            HomeScreen(

                onChatClick = {
                    screen = "chat"
                },

                onVoiceClick = {
                    screen = "voice"
                }

            )

        }



        "chat" -> {

            ChatScreen()

        }



        "voice" -> {

            VoiceScreen()

        }

    }

}
