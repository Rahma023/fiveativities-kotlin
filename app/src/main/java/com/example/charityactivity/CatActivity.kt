package com.example.charityactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class CatActivity : AppCompatActivity() {
    lateinit var btn5: Button
    lateinit var btn4: Button
    lateinit var imgview4: ImageView
    lateinit var tvtext3: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat)
        catActivity()
        click()
    }
    fun catActivity(){
        btn5=findViewById(R.id.btn5)
        btn4=findViewById(R.id.btn4)
        imgview4=findViewById(R.id.imgview4)
        tvtext3=findViewById(R.id.tvtext3)
    }
    fun click(){
        btn5.setOnClickListener {
            val previous=Intent(baseContext,AbayaActivity::class.java)
            startActivity(previous)
        }
       btn4.setOnClickListener {
           val next=Intent(baseContext,LifeActivity::class.java)
           startActivity(next)
       }
    }

    }
