package com.appelo.ai

class PromptManager {

    fun createPrompt(
        userMessage: String
    ): String {

        return """
            You are Appelo,
            a smart AI assistant.

            User:
            $userMessage
        """.trimIndent()
    }
}
