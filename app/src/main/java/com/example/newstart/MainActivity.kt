package com.example.newstart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun onClick(view: View) {  val intent: Intent= Intent(this@MainActivity, MainScreen::class.java)
        when(view.id){
            R.id.button->startActivity(intent)}
    }

    }

