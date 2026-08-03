package com.appelo.smart


class Translator {


    suspend fun translate(
        text: String,
        targetLanguage: String
    ): String {


        // Translation API পরে connect হবে


        return "Translated ($targetLanguage): $text"
    }
}
