package com.example.android.easynutrition_prototype

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterStep3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_step3)

        val btGoogle = findViewById<Button>(R.id.btGoogle)
        btGoogle.setOnClickListener{
            startActivity(Intent(this, ApplStep1::class.java))
        }
        val btFacebook = findViewById<Button>(R.id.btFacebook)
        btFacebook.setOnClickListener{
            startActivity(Intent(this, ApplStep1::class.java))
        }
        val btCorreo = findViewById<Button>(R.id.btCorreo)
        btCorreo.setOnClickListener{
            startActivity(Intent(this, ApplStep1::class.java))
        }

    }
}