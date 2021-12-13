package com.example.myapplication

import com.google.gson.annotations.*

class UserRequest {
    @SerializedName("username")
    @Expose var username:String?=null
    @SerializedName("password")
    @Expose var password:String?=null
}