package com.appelo.smart


class CurrencyConverter {


    suspend fun convert(
        amount: Double,
        from: String,
        to: String
    ): String {


        // Currency API পরে connect হবে


        return "$amount $from = converted value in $to"
    }
}
