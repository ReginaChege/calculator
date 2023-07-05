package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tilbutton1.setOnClickListener {

        }

    }
    override fun onResume(){
        super.onResume()
        binding.tilbutton1.setOnClickListener {
            calculate("+")
        }
        binding.tilbutton1.setOnClickListener {
            calculate("%")
        }
        binding.tilbutton1.setOnClickListener {
            calculate("-")
        }
        binding.tilbutton1.setOnClickListener {
            calculate("button")
        }
    }

//    binding.tilbtn2.setOnClickListener {
//        calculate("m")
//    }
//    binding.tilbtn3.setOnClickListener { multiply(validate()) }
//    tilbtn4.setOnClickListener { modulas() }


    }
    fun calculate(operator:String){

        binding.tilfirst.error=null
        binding.tilsecond.error=null
        var second = tilfirst.text.toString()
        var first = tilsecond.text.toString()
        var error=false
        if (first.isBlank()) {
            binding.tilfirst.error = "first is required"
//            error = true
//        }
//        if (second.isBlank()) {
//            binding.tilsecond.error = "second is required"
//            error = true
//        }
        if (!error) {
            var num1=first.toInt()
            var num2=second.toInt()
            var result=when(operator){
                "+"->first.toInt()+second.toInt()
                "%"->first.toInt()%second.toInt()
                "buuton"->first.toInt()*second.toInt()
                "-"->first.toInt()-second.toInt()
                else->throw Exception("Invalid operation")
//            return Values(first=first.toInt(),second.toInt())
        }
        }

    }

//    fun add(values:Values?){
//        if(values!=null) {
//            var sum = values.first + values.second
//            binding. tilbutton1.text=(sum.toString())
//
//        }
//
//    }
//    fun differnce(value:Values?){
//        if(values!=null) {
//            var sum = values.first + values.second
//            binding.tilbutton1.setText(differnce.toString())
//
//        }
//    }
//    fun multiply(values:values?){
//        if(values!=null) {
//            var sum = values.first + values.second
//            binding.tilbutton1.setText(sum.toString())
//            binding.tilbutton1.setText(sum.toString())
//
//        }
//    }
//    fun modulas(Values:values?){
//        if(values!=null) {
//            var sum = values.first + values.second
//            binding.tilbutton1.setText(sum.toString())
//
//        }
}