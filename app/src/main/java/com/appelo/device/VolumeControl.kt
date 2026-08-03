package com.appelo.device

import android.content.Context
import android.media.AudioManager


class VolumeControl(
    context: Context
) {


    private val audioManager =
        context.getSystemService(
            Context.AUDIO_SERVICE
        ) as AudioManager



    fun increaseVolume() {

        audioManager.adjustVolume(
            AudioManager.ADJUST_RAISE,
            AudioManager.FLAG_SHOW_UI
        )
    }



    fun decreaseVolume() {

        audioManager.adjustVolume(
            AudioManager.ADJUST_LOWER,
            AudioManager.FLAG_SHOW_UI
        )
    }
}
