package com.example.android.easynutrition_prototype

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterPatientStep1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_step_patient1)
        val btMan001 = findViewById<Button>(R.id.btMan001)
        btMan001.setOnClickListener{
            startActivity(Intent(this, RegisterPatientStep2::class.java))
        }
    }
}