@file:Suppress("UnusedImport")

package com.example.myapplication


import android.content.Intent
import android.os.*
import androidx.appcompat.app.AppCompatActivity

import kotlin.concurrent.*


class MainActivity : AppCompatActivity() {

    private lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        Handler().postDelayed({
            val i = Intent(this, MainMenu::class.java)
            startActivity(i)
            finish()
        }, 5000)
    }
}