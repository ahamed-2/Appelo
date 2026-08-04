package com.appelo.ai

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Query


interface GeminiService {


    @POST("v1beta/models/gemini-2.0-flash:generateContent")
    suspend fun generateContent(

        @Query("key")
        apiKey: String,

        @Body
        request: GeminiRequest

    ): GeminiResponse

}



data class GeminiRequest(

    val contents: List<Content>

)


data class Content(

    val parts: List<Part>

)


data class Part(

    val text: String

)



data class GeminiResponse(

    val candidates: List<Candidate>

)


data class Candidate(

    val content: Content

)



class GeminiClient(
    private val apiKey: String
) {


    private val service: GeminiService


    init {


        val retrofit =
            Retrofit.Builder()
                .baseUrl(
                    "https://generativelanguage.googleapis.com/"
                )
                .addConverterFactory(
                    GsonConverterFactory.create()
                )
                .build()



        service =
            retrofit.create(
                GeminiService::class.java
            )

    }



    suspend fun askGemini(
        message: String
    ): String {


        val request =
            GeminiRequest(

                contents =
                listOf(

                    Content(

                        parts =
                        listOf(

                            Part(
                                text = message
                            )

                        )

                    )

                )

            )



        val response =
            service.generateContent(
                apiKey,
                request
            )


        return response
            .candidates
            .firstOrNull()
            ?.content
            ?.parts
            ?.firstOrNull()
            ?.text
            ?: "No response"

    }

}
