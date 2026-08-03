package com.appelo.device

import android.content.Context
import android.hardware.camera2.CameraManager


class FlashlightControl(
    private val context: Context
) {


    private val cameraManager =
        context.getSystemService(
            Context.CAMERA_SERVICE
        ) as CameraManager



    fun turnOn() {

        val cameraId =
            cameraManager.cameraIdList[0]

        cameraManager.setTorchMode(
            cameraId,
            true
        )
    }



    fun turnOff() {

        val cameraId =
            cameraManager.cameraIdList[0]

        cameraManager.setTorchMode(
            cameraId,
            false
        )
    }
}
