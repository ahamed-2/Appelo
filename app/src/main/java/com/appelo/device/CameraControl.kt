package com.appelo.device

import android.content.Context
import android.content.Intent
import android.provider.MediaStore


class CameraControl(
    private val context: Context
) {


    fun openCamera() {


        val intent =
            Intent(
                MediaStore.ACTION_IMAGE_CAPTURE
            )


        intent.addFlags(
            Intent.FLAG_ACTIVITY_NEW_TASK
        )


        context.startActivity(intent)
    }
}
