package com.appelo.command

class CommandParser {


    fun analyze(
        text: String
    ): Command {


        val input =
            text.lowercase()


        return when {

            input.contains("open") ->
                Command.OPEN_APP


            input.contains("call") ->
                Command.CALL


            input.contains("message") ||
            input.contains("sms") ->
                Command.SMS


            input.contains("camera") ->
                Command.CAMERA


            input.contains("flashlight") ||
            input.contains("torch") ->
                Command.FLASHLIGHT


            input.contains("alarm") ->
                Command.ALARM


            else ->
                Command.UNKNOWN
        }
    }
}
