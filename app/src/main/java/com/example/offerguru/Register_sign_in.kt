package com.example.offerguru

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class Register_sign_in : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_sign_in)

        val button: Button = findViewById<View>(R.id.bttu) as Button
        val edt1: EditText = findViewById<View>(R.id.edt1) as EditText
        val edt2: EditText = findViewById<View>(R.id.edt2) as EditText
        val edt3: EditText = findViewById<View>(R.id.edt3) as EditText
        val edt4: EditText = findViewById<View>(R.id.edt4) as EditText
        val edt5: EditText = findViewById<View>(R.id.edt5) as EditText


    }
}