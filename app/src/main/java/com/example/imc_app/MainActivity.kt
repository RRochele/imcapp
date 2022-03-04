package com.example.imc_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }
    private fun setListeners() {
        alturaEDT?.doAfterTextChanged { text->

            Toast.makeText( this, text.toString(), Toast.LENGTH_SHORT}.show()
    }
    pesoEDT?.doOnTextChanged { text, _, _,_ ->
        litleTXT?.text=text
    }
}