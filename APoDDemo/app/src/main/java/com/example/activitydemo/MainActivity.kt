package com.example.activitydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var currentValue = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clearClicked(view: View)
    {
        val outputView = findViewById<TextView>(R.id.numberDisplay)


        outputView.text = 0.toString()

    }

    fun numberPressed(view: View)
    {
        val outputView = findViewById<TextView>(R.id.numberDisplay)

        val button = view as Button
        outputView.text = button.text


    }


}

