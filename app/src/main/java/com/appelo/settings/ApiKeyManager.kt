package com.appelo.settings

import android.content.Context
import com.appelo.security.KeyStorage


class ApiKeyManager(
    context: Context
) {


    private val storage =
        KeyStorage(context)



    fun saveGeminiKey(
        key: String
    ) {

        storage.saveAPIKey(
            key
        )

    }



    fun getGeminiKey(): String? {

        return storage.getAPIKey()

    }



    fun removeKey(){

        storage.removeKey()

    }

}
