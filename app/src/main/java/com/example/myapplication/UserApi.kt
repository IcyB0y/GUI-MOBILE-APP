package com.example.myapplication

import retrofit2.*
import retrofit2.http.*

interface UserApi {
    @POST("login")
    fun login(
        @Body userRequest: UserRequest
    ): Call<UserResponse>
}