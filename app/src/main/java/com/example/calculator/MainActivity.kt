package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var tiltitle: TextView
    lateinit var tilfirst: TextView
    lateinit var tilsecond: TextView
    lateinit var tiloutput: TextView
    lateinit var tilbutton1: Button
    lateinit var tilbtn2: Button
    lateinit var tilbtn3: Button
    lateinit var tilbtn4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilfirst = findViewById(R.id.tilfirst)
        tilsecond = findViewById(R.id.tilbtn2)
        tiloutput = findViewById(R.id.tiloutput)
        addNumbers()
    }

    fun addNumbers() {
        var first = findViewById<TextView>(R.id.tilfirst)
        var second = findViewById<TextView>(R.id.tilseconnd)
        var button = findViewById<Button>(R.id.tilbutton1)
        button.setOnClickListener {
            var sumfirst = first.text.toString().toInt()
            var sumsecond = second.text.toString().toInt()
            var output = sumfirst + sumsecond
            Toast.makeText(this, "$output", Toast.LENGTH_SHORT).show()
        }
    }

    fun subNumbers() {
        var first = findViewById<TextView>(R.id.tilfirst)
//        var second=findViewById<TextView>(R.id.til)
        var button = findViewById<Button>(R.id.tilbtn2)
        button.setOnClickListener {
            var subfirst = first.text.toString().toInt()
            var subsecond = tilsecond.text.toString().toInt()
            var output = subfirst - subsecond
            Toast.makeText(this, "$output", Toast.LENGTH_SHORT).show()
        }
    }

    fun multiplyNumbers() {
        var first = findViewById<TextView>(R.id.tilfirst)
        var second = findViewById<TextView>(R.id.tilseconnd)
        var button = findViewById<Button>(R.id.tilbtn3)
        button.setOnClickListener {
            var multifirst = first.text.toString().toInt()
            var multisecond = second.text.toString().toInt()
            var output = multifirst * multisecond
            Toast.makeText(this, "$output", Toast.LENGTH_SHORT).show()
        }
    }
        fun divideNumbers() {
            var first = findViewById<TextView>(R.id.tilfirst)
            var second = findViewById<TextView>(R.id.tilseconnd)
            var button = findViewById<Button>(R.id.tilbtn4)
            button.setOnClickListener {
                var first = first.text.toString().toInt()
                var second = second.text.toString().toInt()
                var output = first / second
                Toast.makeText(this, "$output", Toast.LENGTH_SHORT).show()
            }
        }

}