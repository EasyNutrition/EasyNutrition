package com.example.android.easynutrition_prototype

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class BookAppointmentStepTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_appointment_step_two)
        val btBack001 = findViewById<ImageButton>(R.id.btBack001)
        btBack001.setOnClickListener{
            startActivity(Intent(this, BookAppointmentStepOne::class.java))
        }
    }
}