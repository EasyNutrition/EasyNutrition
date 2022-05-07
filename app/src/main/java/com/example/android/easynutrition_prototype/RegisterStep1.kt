package com.example.android.easynutrition_prototype

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterStep1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_step1)
        val btMan = findViewById<Button>(R.id.btMan)
        btMan.setOnClickListener{
            startActivity(Intent(this, RegisterStep2::class.java))
        }
    }
}