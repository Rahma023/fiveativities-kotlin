package com.example.charityactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class AbayaActivity : AppCompatActivity() {
    lateinit var btn2:Button
    lateinit var btn3:Button
    lateinit var imgview2:ImageView
    lateinit var tvtext2:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abaya)
        abayaActivity()
        click()

    }
    fun abayaActivity(){
        btn2=findViewById(R.id.btn2)
        btn3=findViewById(R.id.btn3)
        imgview2=findViewById(R.id.imgview2)
        tvtext2=findViewById(R.id.tvtext2)
    }
    fun click(){
        btn2.setOnClickListener {
            val previous=Intent(baseContext,MainActivity::class.java)
            startActivity(previous)
        }
        btn3.setOnClickListener {
            val next=Intent(baseContext,CatActivity::class.java)
            startActivity(next)
        }

    }
}