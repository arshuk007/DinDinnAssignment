package com.example.dindinn.network

import com.example.dindinn.model.response.*
import retrofit2.Call
import retrofit2.http.*


interface ApiService {

    @GET("data")
    suspend fun getData(): OrderResponseModel

    @GET("incredient")
    suspend fun getIncredients(): OrderResponseModel

}

