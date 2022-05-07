package com.example.android.easynutrition_prototype

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterStep2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_step2)

        val btGoAppl_1 = findViewById<Button>(R.id.btGoAppl_1)
        btGoAppl_1.setOnClickListener{
            startActivity(Intent(this, RegisterStep3::class.java))
        }
    }
}