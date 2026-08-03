package com.appelo.device

import android.content.Context
import android.content.Intent
import android.net.Uri


class SMSManager(
    private val context: Context
) {


    fun sendSMS(
        number: String,
        message: String
    ) {


        val intent =
            Intent(
                Intent.ACTION_VIEW,
                Uri.parse("sms:$number")
            )


        intent.putExtra(
            "sms_body",
            message
        )


        intent.addFlags(
            Intent.FLAG_ACTIVITY_NEW_TASK
        )


        context.startActivity(intent)
    }
}
