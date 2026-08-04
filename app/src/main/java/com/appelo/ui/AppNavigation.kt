package com.appelo.ui

import androidx.compose.runtime.*


@Composable
fun AppNavigation(){


    var currentScreen by remember {

        mutableStateOf("home")

    }



    when(currentScreen){


        "home" -> {


            HomeScreen(

                onChatClick = {

                    currentScreen =
                        "chat"

                },


                onVoiceClick = {

                    currentScreen =
                        "voice"

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
