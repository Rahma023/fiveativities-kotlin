package com.example.charityactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btn1: Button
    lateinit var imageview3: ImageView
    lateinit var tvtext1: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        secondView()
        click()
    }
    fun secondView(){
        btn1=findViewById(R.id.btn1)
        imageview3= findViewById(R.id.imageView3)
        tvtext1 = findViewById(R.id.tvtext1)
    }
    fun click(){
        btn1.setOnClickListener {
            val next= Intent(baseContext,AbayaActivity::class.java)
            startActivity(next)
        }

    }
}

