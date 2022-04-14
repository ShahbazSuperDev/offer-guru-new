package com.example.offerguru

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Forgot_password : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        val button: Button = findViewById<View>(R.id.bttu) as Button
        val edt1: EditText = findViewById<View>(R.id.edt3) as EditText

        button.setOnClickListener {
            if(edt1.text.isNullOrBlank())
            {Toast.makeText(this@Forgot_password, "Forgot password.", Toast.LENGTH_SHORT).show()}
            else{Toast.makeText(this@Forgot_password, "${edt1.text} is submitted!!.", Toast.LENGTH_SHORT).show()}
        }
    }
}