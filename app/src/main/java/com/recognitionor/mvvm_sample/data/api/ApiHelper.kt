package com.recognitionor.mvvm_sample.data.api

import com.recognitionor.mvvm_sample.data.model.Test

interface ApiHelper {

    suspend fun getTest(params: HashMap<String, Any?>): Test?

    suspend fun setTest(params: HashMap<String, Any?>)

}