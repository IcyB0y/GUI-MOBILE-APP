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



        handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            val intent = Intent(this, MenuGlowne::class.java)
            startActivity(intent)
            finish()
        }, 5000)
    }
}