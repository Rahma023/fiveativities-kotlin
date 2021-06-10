package com.example.charityactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class LifeActivity : AppCompatActivity() {
    lateinit var btn6:Button
    lateinit var btn7:Button
    lateinit var imgview6:ImageView
    lateinit var tvtext4:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life)
        experiencedPeople()
        click()
    }
    fun experiencedPeople(){
        btn6=findViewById(R.id.btn6)
        btn7=findViewById(R.id.btn7)
        imgview6=findViewById(R.id.imgview6)
        tvtext4=findViewById(R.id.tvtext4)

    }
    fun click(){
        btn6.setOnClickListener {
            val previous=Intent(baseContext,CatActivity::class.java)
            startActivity(previous)
        }
        btn7.setOnClickListener {
            val next=Intent(baseContext,NatureActivity::class.java)
            startActivity(next)
        }
    }
}