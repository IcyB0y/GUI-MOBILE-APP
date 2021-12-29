package com.example.myapplication

import com.google.gson.*
import retrofit2.*
import retrofit2.converter.gson.*

class Retro {
    fun getRetroClientInstance():Retrofit{
        val gson = GsonBuilder().setLenient().create()
        return Retrofit.Builder()
            .baseUrl("http://3.70.220.22:8000")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }
}