package com.example.myapplication

import com.google.gson.annotations.*



class UserResponse {
    @SerializedName("data")
    @Expose
    var data: User? = null

    class User {
        @SerializedName("username")
        @Expose
        var username: String? = null
       @SerializedName("token")
        @Expose
        var token: String? = null
    }
}