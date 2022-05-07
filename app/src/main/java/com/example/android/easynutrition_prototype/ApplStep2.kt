package com.example.android.easynutrition_prototype

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ApplStep2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appl_step2)

        val btGoAppl01 = findViewById<Button>(R.id.btGoAppl01)
        btGoAppl01.setOnClickListener{
            startActivity(Intent(this, ApplStep3::class.java))
        }
    }
}