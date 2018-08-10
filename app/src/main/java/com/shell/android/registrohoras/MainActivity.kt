package com.shell.android.registrohoras

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    val BEGIN_DAY = 1
    val BEGIN_DINNER = 2
    val END_DINNER = 3
    val END_DAY = 4

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBeginDay.setOnClickListener(this)
        btnEndDay.setOnClickListener(this)
        btnStartDinner.setOnClickListener(this)
        btnStopDinner.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        var type = 0
        when (v.id) {
            R.id.btnBeginDay -> {
                type = BEGIN_DAY
            }
            R.id.btnEndDay -> {
                type = END_DAY
            }
            R.id.btnStartDinner -> {
                type = BEGIN_DINNER
            }
            R.id.btnStopDinner -> {
                type = END_DINNER
            }
        }
        registerHour(BuildConfig.URL, type, Date(), edtComments.text.toString())
    }


}
