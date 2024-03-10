package com.example.limpagassigns

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CalendarView
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class CalendarActivity : AppCompatActivity() {
    private var mCalendarView: CalendarView? = null

    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)
        mCalendarView = findViewById<View>(R.id.calendarView) as CalendarView

        val calendar = Calendar.getInstance()
        calendar.set(2024, Calendar.JANUARY, 1)
        val initialDateInMillis = calendar.timeInMillis
        mCalendarView!!.date = initialDateInMillis

        mCalendarView!!.setOnDateChangeListener { calendarView, i, i1, i2 ->
            val date = (i1 + 1).toString() + "/" + i2 + "/" + i
            Log.d(
                TAG,
                "onSelectedDayChange: mm/dd/yyyy: $date"
            )
            val intent = Intent(this@CalendarActivity, MainActivity::class.java)
            intent.putExtra("date", date)
            startActivity(intent)
        }
    }

    companion object {
        private const val TAG = "CalendarActivity"
    }
}
