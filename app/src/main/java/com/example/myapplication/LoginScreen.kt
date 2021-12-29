package com.example.myapplication

import android.content.*
import android.os.*
import android.util.*
import android.view.*
import android.widget.*
import androidx.appcompat.app.*
import retrofit2.*

class LoginScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        configureLoginButton();
        configureRegistrationButton();
    }


    fun configureLoginButton(){
        val btn_login = findViewById<Button>(R.id.btn_login)
        btn_login.setOnClickListener {
            login()
        }}


    fun configureRegistrationButton() {


        val btn_new_user = findViewById<Button>(R.id.btn_new_user);
        btn_new_user.setOnClickListener(View.OnClickListener {
            val Intent = Intent(this, RegistrationScreen::class.java)
            startActivity(Intent)
        })
    }

    fun login(){
        val request = UserRequest()
        val et_username = findViewById<EditText>(R.id.et_username)
        val et_password = findViewById<EditText>(R.id.et_password)
        request.username = et_username.text.toString().trim()
        request.password = et_password.text.toString().trim()

        val retro = Retro().getRetroClientInstance().create(UserApi::class.java)
        retro.login(request).enqueue(object : retrofit2.Callback<UserResponse> {
            override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>) {
                val user = response.body()
                Log.e("token", user!!.data?.token!!)
                Log.e("username", user!!.data?.username!!)
            }

            override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                Log.e("message", t.message!!)
            }

        })
    }






}