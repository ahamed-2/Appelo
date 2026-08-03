package com.appelo.ai

class GeminiClient(
    private val apiKey: String
) {

    suspend fun generateResponse(
        prompt: String
    ): String {

        // Gemini API integration এখানে হবে

        return "Appelo AI response for: $prompt"
    }
}
