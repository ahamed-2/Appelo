package com.appelo.device

import android.content.Context
import android.content.Intent
import android.content.IntentFilter


class BatteryManager(
    private val context: Context
) {


    fun getBatteryLevel(): Int {

        val batteryIntent =
            context.registerReceiver(
                null,
                IntentFilter(Intent.ACTION_BATTERY_CHANGED)
            )


        return batteryIntent?.getIntExtra(
            "level",
            -1
        ) ?: -1
    }
}
