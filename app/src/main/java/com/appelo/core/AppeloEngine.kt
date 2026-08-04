package com.appelo.core


class AppeloEngine {


    private val featureManager =
        FeatureManager()



    private val router =
        IntentRouter()



    suspend fun execute(
        userCommand: String
    ): String {


        val command =
            featureManager
                .commandParser
                .analyze(userCommand)



        val result =
            router.route(command)



        return result
    }
}
