package com.zfuncode.viewmodeltopicsatu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class WithoutViewModel : AppCompatActivity() {

    lateinit var btnUbah : Button
    lateinit var txtResult : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_without_view_model)

        btnUbah = findViewById(R.id.btnUbah)
        txtResult = findViewById(R.id.txtUbah)

        btnUbah.setOnClickListener{
            txtResult.text = "Welcome to And 1"
        }
    }
}