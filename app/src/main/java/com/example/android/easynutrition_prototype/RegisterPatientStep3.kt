package com.example.android.easynutrition_prototype

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterPatientStep3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_patient_step3)

        val btGoogle002 = findViewById<Button>(R.id.btGoogle002)
        btGoogle002.setOnClickListener{
            startActivity(Intent(this, PatientHomeView::class.java))
        }
        val btFacebook002 = findViewById<Button>(R.id.btFacebook002)
        btFacebook002.setOnClickListener{
            startActivity(Intent(this, PatientHomeView::class.java))
        }
        val btCorreo002 = findViewById<Button>(R.id.btCorreo002)
        btCorreo002.setOnClickListener{
            startActivity(Intent(this, PatientHomeView::class.java))
        }
    }
}