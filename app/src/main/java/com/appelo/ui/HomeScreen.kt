package com.appelo.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun HomeScreen(

    onChatClick: () -> Unit,

    onVoiceClick: () -> Unit

){

    Box(

        modifier =
        Modifier
            .fillMaxSize()
            .background(
                Color(0xFF050816)
            )

    ){


        ParticleBackground()


        Column(

            modifier =
            Modifier.fillMaxSize(),

            horizontalAlignment =
            Alignment.CenterHorizontally,

            verticalArrangement =
            Arrangement.Center

        ){


            Box(

                contentAlignment =
                Alignment.Center

            ){


                OrbitRing()


                AIRotatingLogo()


            }



            Spacer(
                modifier =
                Modifier.height(35.dp)
            )



            Text(

                text =
                "Your Personal AI Assistant",

                color =
                Color.White,

                style =
                MaterialTheme.typography
                    .headlineSmall

            )



            Spacer(
                modifier =
                Modifier.height(15.dp)
            )



            VoiceWaveform()



            Spacer(
                modifier =
                Modifier.height(30.dp)
            )



            Row{


                FuturisticButton(

                    text =
                    "🎤 Voice",

                    onClick =
                    onVoiceClick

                )


                Spacer(
                    modifier =
                    Modifier.width(20.dp)
                )



                FuturisticButton(

                    text =
                    "💬 Chat",

                    onClick =
                    onChatClick

                )


            }

        }

    }

}
