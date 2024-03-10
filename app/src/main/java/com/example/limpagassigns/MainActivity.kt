package com.example.limpagassigns

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var theDate: TextView? = null
    private var btnGoCalendar: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        theDate = findViewById<View>(R.id.date) as TextView
        btnGoCalendar = findViewById<View>(R.id.btnGoCalendar) as Button
        val incomingIntent = intent
        val date = incomingIntent.getStringExtra("date")
        theDate!!.text = date
        btnGoCalendar!!.setOnClickListener {
            val intent = Intent(this@MainActivity, CalendarActivity::class.java)
            startActivity(intent)
        }
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}