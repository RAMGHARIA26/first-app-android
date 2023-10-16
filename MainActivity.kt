package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button1 = findViewById<Button>(R.id.mybutton1)
        var imageView = findViewById<ImageView>(R.id.imageView)

        button1.setOnClickListener {
            if(button1.text.toString() == "ON"){
                imageView.setImageResource(R.drawable.onbulb1)
                button1.text = "OFF"

            }else{
                imageView.setImageResource(R.drawable.offbulb)
                button1.text="ON"
            }
        }


    }
}
