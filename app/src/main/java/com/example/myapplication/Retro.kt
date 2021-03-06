package com.example.myapplication

import com.google.gson.*
import retrofit2.*
import retrofit2.converter.gson.*

class Retro {
    fun getRetroClientInstance():Retrofit{
        val gson = GsonBuilder().setLenient().create()
        return Retrofit.Builder()
            .baseUrl("http://3.65.21.2:3000")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }
}