package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Sample button
        val btn = findViewById<Button>(R.id.button)
        var txtView = findViewById<TextView>(R.id.textView)
        var timeClicked = 0
        btn.setOnClickListener {
            txtView.text = timeClicked.toString()
            timeClicked += 1
        }
    }
}