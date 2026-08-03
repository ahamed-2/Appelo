package com.appelo.files

import android.content.Context
import java.io.File


class FileSearch(
    private val context: Context
) {


    fun searchFile(
        fileName: String
    ): List<String> {


        val result = mutableListOf<String>()


        val directory =
            context.getExternalFilesDir(null)


        directory?.walkTopDown()?.forEach {

            if(it.name.contains(fileName, true)) {

                result.add(
                    it.absolutePath
                )
            }
        }


        return result
    }
}
