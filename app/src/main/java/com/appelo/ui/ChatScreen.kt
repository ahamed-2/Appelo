package com.appelo.ui

import android.content.Context
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.platform.LocalContext
import com.appelo.ai.AIController
import kotlinx.coroutines.launch


data class ChatMessage(
    val text: String,
    val isUser: Boolean
)



@Composable
fun ChatScreen(){


    val context =
        LocalContext.current


    val scope =
        rememberCoroutineScope()



    val aiController =
        remember {

            AIController(
                context
            )

        }



    var input by remember {

        mutableStateOf("")

    }



    val messages =
        remember {

            mutableStateListOf<ChatMessage>()

        }



    Column(

        modifier =
        Modifier
            .fillMaxSize()
            .padding(16.dp)

    ){



        Text(

            text =
            "Appelo AI 🤖",

            style =
            MaterialTheme.typography
                .headlineMedium

        )



        Spacer(
            modifier =
            Modifier.height(15.dp)
        )



        LazyColumn(

            modifier =
            Modifier.weight(1f)

        ){


            items(messages){ msg ->


                Text(

                    text =
                    if(msg.isUser)
                        "You: ${msg.text}"
                    else
                        "Appelo: ${msg.text}",

                    modifier =
                    Modifier.padding(8.dp)

                )


            }

        }



        Row{


            OutlinedTextField(

                value = input,

                onValueChange = {

                    input = it

                },

                modifier =
                Modifier.weight(1f),

                label = {

                    Text("Ask Appelo")

                }

            )



            Spacer(
                modifier =
                Modifier.width(8.dp)
            )



            Button(

                onClick = {


                    val question =
                        input


                    if(question.isNotEmpty()){


                        messages.add(

                            ChatMessage(
                                question,
                                true
                            )

                        )


                        input = ""



                        scope.launch {


                            val answer =
                                aiController
                                    .askAI(
                                        question
                                    )



                            messages.add(

                                ChatMessage(
                                    answer,
                                    false
                                )

                            )

                        }


                    }


                }

            ){

                Text("Send")

            }

        }

    }

}
