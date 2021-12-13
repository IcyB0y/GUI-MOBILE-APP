package com.example.myapplication

import android.os.*
import android.util.*
import androidx.appcompat.app.*
import kotlinx.android.synthetic.main.activity_menu_glowne.*
import retrofit2.*

class MenuGlowne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_glowne)
        initAction()
    }
        fun initAction(){
            btn_login.setOnClickListener {
                login()
            }
        }

        fun login(){
        val request = UserRequest()
            request.username = et_username.text.toString().trim()
            request.password = et_password.text.toString().trim()

            val retro = Retro().getRetroClientInstance().create(UserApi::class.java)
     retro.login(request).enqueue(object : retrofit2.Callback<UserResponse> {
         override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>) {
             val user = response.body()
           /*  Log.e("token", user!!.data?.token!!)*/
             Log.e("username", user!!.data?.username!!)
         }

         override fun onFailure(call: Call<UserResponse>, t: Throwable) {
             Log.e("Error", t.message!!)
         }

     })
        }

}

