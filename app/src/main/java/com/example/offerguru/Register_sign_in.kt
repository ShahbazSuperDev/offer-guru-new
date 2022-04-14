package com.example.offerguru

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

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

        button.setOnClickListener {
            if(edt1.text.isNullOrBlank()&&edt2.text.isNullOrBlank()&&edt3.text.isNullOrBlank()&&edt4.text.isNullOrBlank()&&edt5.text.isNullOrBlank())
            { Toast.makeText(this@Register_sign_in, "please enter Full name.", Toast.LENGTH_SHORT).show()}
            else{
                Toast.makeText(this@Register_sign_in, "${edt1.text} is Register!!.", Toast.LENGTH_SHORT).show()}
        }
    }
}