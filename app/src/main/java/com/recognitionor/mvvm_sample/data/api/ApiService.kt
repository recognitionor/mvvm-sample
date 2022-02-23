package com.recognitionor.mvvm_sample.data.api

import com.recognitionor.mvvm_sample.data.model.Test
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {

    @POST("/test/get")
    suspend fun getTest(@Body params: HashMap<String, Any?>): Test

    @POST("test/set")
    suspend fun setTest(@Body params: HashMap<String, Any?>)

}