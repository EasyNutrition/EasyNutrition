package com.example.android.easynutrition_prototype

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PatientHomeView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patient_home_view)

        val btBookAppointment = findViewById<Button>(R.id.btBookAppointment)
        btBookAppointment.setOnClickListener{
            startActivity(Intent(this, BookAppointmentStepOne::class.java))
        }
    }
}