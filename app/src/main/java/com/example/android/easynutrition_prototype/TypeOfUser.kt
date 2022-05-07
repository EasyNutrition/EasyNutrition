package com.example.android.easynutrition_prototype

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TypeOfUser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_type_of_user)

        val btSelectPatient = findViewById<Button>(R.id.btSelectPatient)
        btSelectPatient.setOnClickListener{
            startActivity(Intent(this, RegisterPatientStep1::class.java))
        }

        val btSelectNutrionist = findViewById<Button>(R.id.btSelectNutrionist)
        btSelectNutrionist.setOnClickListener{
            startActivity(Intent(this, RegisterStep1::class.java))
        }
    }
}