package com.example.calctutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener {
            val number1 = etNumber1.text.toString().toInt()
            val number2 = etNumber2.text.toString().toInt()
            val result = number1 + number2

            tvResult.text = result.toString()

        }
    }
}