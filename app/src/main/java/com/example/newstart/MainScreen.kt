package com.example.newstart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)
    }

    fun onClick1(view: View) {  val intent: Intent= Intent(this@MainScreen, Screen2::class.java)
        when(view.id){
            R.id.button2->startActivity(intent)}

}

    fun onClick3(view: View) {
        val intent: Intent = Intent(this@MainScreen, Screen3::class.java)
        when (view.id) {
            R.id.button5 -> startActivity(intent)
        }
        fun onClick4(view: View) {}
    }
}

