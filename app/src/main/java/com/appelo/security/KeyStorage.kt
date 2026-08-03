package com.appelo.security

import android.content.Context
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKeys


class KeyStorage(
    private val context: Context
) {


    private val masterKey =
        MasterKeys.getOrCreate(
            MasterKeys.AES256_GCM_SPEC
        )


    private val preferences =
        EncryptedSharedPreferences.create(
            "appelo_secure_keys",
            masterKey,
            context,
            EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
            EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
        )



    fun saveAPIKey(
        key: String
    ) {

        preferences.edit()
            .putString(
                "gemini_key",
                key
            )
            .apply()
    }



    fun getAPIKey(): String? {

        return preferences.getString(
            "gemini_key",
            null
        )
    }


    fun removeKey(){

        preferences.edit()
            .remove("gemini_key")
            .apply()

    }
}
