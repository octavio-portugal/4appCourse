package com.a4appcurso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle
import kotlinx.android.synthetic.main.activity_leitura_do_ebook.*

class LeituraDoEbook : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leitura_do_ebook)

        pdfview.fromAsset("ebook.pdf")
            .defaultPage(0)
            .enableDoubletap(true)
            .enableSwipe(true)
            .scrollHandle(DefaultScrollHandle(this))
            .load()
    }
}