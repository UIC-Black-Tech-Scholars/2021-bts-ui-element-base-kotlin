package com.example.bts_ui_element_base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var TAG:String = "MainActivity"
    private lateinit var button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        button.setOnClickListener{ view ->
            Toast.makeText(this, "You have pressed the button!!!", Toast.LENGTH_SHORT).show()
            Log.d(TAG, "You have pressed the button, here is the log!!")
        }
    }
}