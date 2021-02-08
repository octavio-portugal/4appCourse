package com.a4appcurso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var botao = btn_leitura
        botao.setOnClickListener {
            var intent = Intent(this, LeituraDoEbook::class.java)
            startActivity(intent)

        }

    }
}