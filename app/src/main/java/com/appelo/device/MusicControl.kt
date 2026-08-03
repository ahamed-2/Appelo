package com.appelo.device

import android.content.Context
import android.content.Intent


class MusicControl(
    private val context: Context
) {


    fun play() {

        val intent =
            Intent(
                "android.intent.action.MEDIA_BUTTON"
            )

        context.sendBroadcast(intent)

    }


    fun pause() {

        val intent =
            Intent(
                "android.intent.action.MEDIA_BUTTON"
            )

        context.sendBroadcast(intent)

    }
}
