package com.appelo.files


import android.content.Context
import android.graphics.pdf.PdfRenderer
import android.os.ParcelFileDescriptor


class PDFReader {


    fun readPDF(
        fileDescriptor: ParcelFileDescriptor
    ): String {


        val renderer =
            PdfRenderer(fileDescriptor)


        val pages =
            renderer.pageCount


        renderer.close()


        return "PDF contains $pages pages"
    }
}
