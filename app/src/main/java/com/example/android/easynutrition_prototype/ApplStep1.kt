package com.example.android.easynutrition_prototype

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ApplStep1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appl_step1)

        val btGoAppl_1 = findViewById<Button>(R.id.btGoAppl_1)
        btGoAppl_1.setOnClickListener{
            startActivity(Intent(this, ApplStep2::class.java))
        }

    }
}