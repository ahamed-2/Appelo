package com.appelo.ai

import android.content.Context
import com.appelo.settings.ApiKeyManager


class AIController(
    context: Context
) {


    private val keyManager =
        ApiKeyManager(context)



    suspend fun askAI(
        message: String
    ): String {


        val apiKey =
            keyManager.getGeminiKey()



        if(apiKey.isNullOrEmpty()) {

            return "Please add Gemini API Key first."

        }



        return try {


            val gemini =
                GeminiClient(
                    apiKey
                )


            gemini.askGemini(
                message
            )


        } catch(e: Exception) {


            "AI Error: ${e.message}"

        }

    }

}
