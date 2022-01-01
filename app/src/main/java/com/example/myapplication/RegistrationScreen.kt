package com.example.myapplication

import android.content.*
import android.os.*
import android.view.*
import android.widget.*
import androidx.appcompat.app.*

class RegistrationScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration_screen)

    test();
        configureBackButton();
    }

    fun configureBackButton() {



            val back_btn = findViewById<Button>(R.id.registration_back_button);
            back_btn.setOnClickListener(View.OnClickListener {
                val Intent = Intent(this, LoginScreen::class.java)
                startActivity(Intent)
                finish()
            })

    }

fun test(){
    val register= findViewById<Button>(R.id.registration_button);
    register.setOnClickListener(View.OnClickListener {






















    })

}

}