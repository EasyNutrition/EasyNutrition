package com.example.android.easynutrition_prototype

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class BookAppointmentStepOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_appointment_step_one)

        val etDateReserve = findViewById<EditText>(R.id.etDateReserve)
        etDateReserve.setOnClickListener{ showDatePickerDialog() }

        val etTimeStart = findViewById<EditText>(R.id.etTimeStart)
        etTimeStart.setOnClickListener{ showTimeStartPickerDialog() }

        val etTimeEnd = findViewById<EditText>(R.id.etTimeEnd)
        etTimeEnd.setOnClickListener{ showTimeEndPickerDialog() }

        val btSearchNutritionist = findViewById<Button>(R.id.btSearchNutritionist)
        btSearchNutritionist.setOnClickListener{
            startActivity(Intent(this, BookAppointmentStepTwo::class.java))
        }
    }

    private fun showDatePickerDialog(){
        val datePicker = DatePickerFragment { day, month, year -> onDateSelected(day, month, year) }
        datePicker.show(supportFragmentManager, "datePicker")
    }

    private fun onDateSelected(day: Int, month: Int, year: Int) {
        val etDateReserve = findViewById<EditText>(R.id.etDateReserve)
        etDateReserve.setText("$day/$month/$year")
    }


    private fun showTimeStartPickerDialog() {
        val timePicker = TimePickerFragment {  onTimeStartSelected(it) }
        timePicker.show(supportFragmentManager, "timePicker")
    }

    private fun onTimeStartSelected(time: String) {
        val etTimeStart = findViewById<EditText>(R.id.etTimeStart)
        etTimeStart.setText("$time")
    }

    private fun showTimeEndPickerDialog() {
        val timePicker = TimePickerFragment {  onTimeEndSelected(it) }
        timePicker.show(supportFragmentManager, "timePicker")
    }

    private fun onTimeEndSelected(time: String) {
        val etTimeEnd = findViewById<EditText>(R.id.etTimeEnd)
        etTimeEnd.setText("$time")
    }
}