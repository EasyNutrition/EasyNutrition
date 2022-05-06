package com.example.usergoalpatientbookappointment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btBookAppointment = findViewById<Button>(R.id.btBookAppointment)
        btBookAppointment.setOnClickListener{
            startActivity(Intent(this, BookAppointmentStepOne::class.java))
        }
    }
}