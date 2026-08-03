package com.appelo.device

import android.os.Build


class DeviceInfo {


    fun getInfo(): String {


        return """
            Brand: ${Build.BRAND}
            Model: ${Build.MODEL}
            Android: ${Build.VERSION.RELEASE}
        """.trimIndent()

    }
}
