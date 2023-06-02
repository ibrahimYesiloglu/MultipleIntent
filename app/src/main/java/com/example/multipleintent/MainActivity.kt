package com.example.multipleintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    val count: Int =0
    lateinit var sayHelloButton: Button
    lateinit var countButton: Button
    lateinit var countText: TextView









    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        sayHelloButton= findViewById(R.id.button_say_hello)
        countButton= findViewById(R.id.button_count)
        countText= findViewById(R.id.textView_number)



        sayHelloButton.setOnClickListener {View.OnClickListener {
                openSecondActivity()
            }
        countButton.setOnClickListener { View.OnClickListener {
            plusCount()
        } }
        }


    }
    fun openSecondActivity() {
    }
    fun plusCount() {

    }
}