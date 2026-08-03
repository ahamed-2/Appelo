package com.appelo.security


import android.util.Base64


class EncryptionManager {


    fun encrypt(
        data: String
    ): String {


        return Base64.encodeToString(
            data.toByteArray(),
            Base64.DEFAULT
        )
    }



    fun decrypt(
        encrypted: String
    ): String {


        return String(
            Base64.decode(
                encrypted,
                Base64.DEFAULT
            )
        )
    }
}
