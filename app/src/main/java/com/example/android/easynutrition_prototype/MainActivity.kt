package com.example.android.easynutrition_prototype

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bt_Start = findViewById<Button>(R.id.bt_Start)

        bt_Start.setOnClickListener{
            startActivity(Intent(this, TypeOfUser::class.java))
        }

    }
}