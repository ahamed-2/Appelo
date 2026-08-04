package com.appelo.core


import com.appelo.command.Command


class IntentRouter {


    fun route(
        command: Command
    ): String {


        return when(command){


            Command.OPEN_APP ->
                "Opening application"


            Command.CALL ->
                "Calling contact"


            Command.SMS ->
                "Sending message"


            Command.CAMERA ->
                "Opening camera"


            Command.FLASHLIGHT ->
                "Controlling flashlight"


            Command.ALARM ->
                "Setting alarm"


            Command.UNKNOWN ->
                "I don't understand"

        }
    }
}
