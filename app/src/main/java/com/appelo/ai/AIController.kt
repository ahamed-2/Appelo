package com.appelo.ai

class AIController {

    suspend fun askAI(
        message: String
    ): String {

        // Gemini API পরে connect হবে

        return "You said: $message"
    }
}
