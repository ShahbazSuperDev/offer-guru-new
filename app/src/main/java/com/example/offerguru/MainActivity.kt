package com.example.offerguru

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.content.Intent




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById<View>(R.id.bttu) as Button
        val edt1: EditText = findViewById<View>(R.id.edt1) as EditText
        val edt2: EditText = findViewById<View>(R.id.edt2) as EditText
        val txt1: TextView = findViewById<View>(R.id.txt1) as TextView
        val txt2: TextView = findViewById<View>(R.id.txt2) as TextView
        button.setOnClickListener {
if(edt1.text.isNullOrBlank()&&edt2.text.isNullOrBlank())
{ Toast.makeText(this@MainActivity, "please enter email.", Toast.LENGTH_SHORT).show()}
            else{Toast.makeText(this@MainActivity, "${edt1.text} is logged in!!.", Toast.LENGTH_SHORT).show()}
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
txt1. setOnClickListener{
    val intent = Intent(this, Forgot_password::class.java)
    startActivity(intent)
    Toast.makeText(this@MainActivity, "Open Forgot.", Toast.LENGTH_SHORT).show()

}
txt2.setOnClickListener{
    val intent = Intent(this, Register_sign_in::class.java)
    startActivity(intent)
    Toast.makeText(this@MainActivity, "Open Register .", Toast.LENGTH_SHORT).show()

}

    }
}