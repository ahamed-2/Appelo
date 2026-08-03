package com.appelo.device

import android.os.Environment
import android.os.StatFs


class StorageInfo {


    fun getStorage(): String {


        val path =
            Environment
                .getDataDirectory()


        val stat =
            StatFs(
                path.path
            )


        val total =
            stat.totalBytes / (1024 * 1024)


        val available =
            stat.availableBytes / (1024 * 1024)



        return """
            Total: ${total} MB
            Available: ${available} MB
        """.trimIndent()
    }
}
