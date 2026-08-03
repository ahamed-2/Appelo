package com.appelo.smart

class Calculator {

    fun calculate(
        expression: String
    ): String {

        return try {

            val result =
                expression
                    .replace(" ", "")
                    .toDouble()

            result.toString()

        } catch (e: Exception) {

            "Unable to calculate"

        }
    }
}
