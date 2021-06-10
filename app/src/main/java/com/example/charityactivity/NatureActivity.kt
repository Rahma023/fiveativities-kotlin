package com.example.charityactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class NatureActivity : AppCompatActivity() {
    lateinit var btnlast:Button
    lateinit var imgview7:ImageView
    lateinit var tvtext5:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nature)
        lastPage()
        click()
    }
    fun lastPage(){
        btnlast=findViewById(R.id.btnlast)
        imgview7=findViewById(R.id.imgview7)
        tvtext5=findViewById(R.id.tvtext5)
    }
    fun click(){
        btnlast.setOnClickListener {
            val previous=Intent(baseContext,LifeActivity::class.java)
            startActivity(previous)
        }

    }
}