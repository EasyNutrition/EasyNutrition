package com.example.android.easynutrition_prototype

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterPatientStep2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_patient_step2)
        val btPatientNext = findViewById<Button>(R.id.btPatientNext)
        btPatientNext.setOnClickListener{
            startActivity(Intent(this, RegisterPatientStep3::class.java))
        }
    }
}