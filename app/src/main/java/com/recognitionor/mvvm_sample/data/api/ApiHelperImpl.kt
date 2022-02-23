package com.recognitionor.mvvm_sample.data.api

import com.recognitionor.mvvm_sample.data.model.Test

class ApiHelperImpl(private val apiService: ApiService) : ApiHelper {
    override suspend fun getTest(params: HashMap<String, Any?>): Test = apiService.getTest(params)

    override suspend fun setTest(params: HashMap<String, Any?>) = apiService.setTest(params)

}