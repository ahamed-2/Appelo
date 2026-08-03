package com.appelo.device

import android.content.Context
import android.content.Intent


class AppLauncher(
    private val context: Context
) {


    fun openApp(
        packageName: String
    ) {

        val intent =
            context.packageManager
                .getLaunchIntentForPackage(packageName)


        intent?.let {
            it.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(it)
        }
    }
}
