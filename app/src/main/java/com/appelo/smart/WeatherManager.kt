package com.appelo.smart


class WeatherManager {


    suspend fun getWeather(
        city: String
    ): String {


        // Weather API integration এখানে হবে


        return "Weather information for $city"
    }
}
