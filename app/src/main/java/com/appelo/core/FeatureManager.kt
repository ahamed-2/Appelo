package com.appelo.core

import com.appelo.ai.AIController
import com.appelo.automation.AutomationManager
import com.appelo.command.CommandParser
import com.appelo.device.*
import com.appelo.smart.*


class FeatureManager {


    val aiController =
        AIController()


    val commandParser =
        CommandParser()


    val automationManager =
        AutomationManager()



    fun processCommand(
        command: String
    ): String {


        val action =
            commandParser.analyze(command)



        return when(action){


            else ->
                "Command received: $command"

        }
    }
}
