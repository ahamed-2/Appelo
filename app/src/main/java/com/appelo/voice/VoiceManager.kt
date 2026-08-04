package com.appelo.voice

import android.content.Context
import android.content.Intent
import android.speech.RecognizerIntent
import android.speech.SpeechRecognizer
import android.speech.tts.TextToSpeech
import java.util.Locale


class VoiceManager(
    private val context: Context
) {


    private var speechRecognizer:
            SpeechRecognizer? = null


    private var textToSpeech:
            TextToSpeech? = null



    init {


        textToSpeech =
            TextToSpeech(
                context
            ){ status ->


                if(status == TextToSpeech.SUCCESS){

                    textToSpeech?.language =
                        Locale.ENGLISH

                }

            }

    }



    fun startListening(
        callback:(String)->Unit
    ){


        speechRecognizer =
            SpeechRecognizer
                .createSpeechRecognizer(
                    context
                )



        val intent =
            Intent(
                RecognizerIntent.ACTION_RECOGNIZE_SPEECH
            )


        intent.putExtra(

            RecognizerIntent
                .EXTRA_LANGUAGE_MODEL,

            RecognizerIntent
                .LANGUAGE_MODEL_FREE_FORM

        )



        speechRecognizer
            ?.setRecognitionListener(

                object :
                android.speech.RecognitionListener{


                    override fun onResults(
                        results: android.os.Bundle?
                    ){


                        val data =
                            results
                                ?.getStringArrayList(
                                    SpeechRecognizer.RESULTS_RECOGNITION
                                )


                        data?.firstOrNull()
                            ?.let {

                                callback(it)

                            }

                    }



                    override fun onReadyForSpeech(p0: android.os.Bundle?) {}

                    override fun onBeginningOfSpeech(){}

                    override fun onRmsChanged(p0:Float){}

                    override fun onBufferReceived(p0:ByteArray?){}

                    override fun onEndOfSpeech(){}

                    override fun onError(p0:Int){}

                    override fun onPartialResults(p0:android.os.Bundle?){}

                    override fun onEvent(
                        p0:Int,
                        p1:android.os.Bundle?
                    ){}

                }

            )



        speechRecognizer
            ?.startListening(
                intent
            )

    }




    fun speak(
        text:String
    ){


        textToSpeech?.speak(

            text,

            TextToSpeech.QUEUE_FLUSH,

            null,

            "APPELO"

        )

    }

}
