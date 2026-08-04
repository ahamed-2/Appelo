package com.appelo.ui

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext
import com.appelo.ai.AIController
import com.appelo.voice.VoiceManager
import kotlinx.coroutines.launch



@Composable
fun VoiceScreen(){


    val context =
        LocalContext.current


    val scope =
        rememberCoroutineScope()



    val voiceManager =
        remember {

            VoiceManager(
                context
            )

        }



    val ai =
        remember {

            AIController(
                context
            )

        }



    var status by remember {

        mutableStateOf(
            "Tap to talk"
        )

    }



    Surface{


        Button(

            onClick = {


                status =
                    "Listening..."



                voiceManager
                    .startListening{


                        scope.launch {


                            status =
                                it



                            val reply =
                                ai.askAI(
                                    it
                                )


                            voiceManager
                                .speak(
                                    reply
                                )


                            status =
                                reply

                        }


                    }

            }

        ){


            Text(
                status
            )

        }


    }

}
