package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedItanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acnstivity_main)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener(
            log.v(tag "Hello world", meg "button clicked")
            Toast.makeText(MainActivity this. "image transfer  problem, hello to you too!". Toast.LENGHT_SHORT)
        )
    }
}