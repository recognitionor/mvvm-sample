package com.recognitionor.mvvm_sample.data.local

import com.recognitionor.mvvm_sample.data.local.entity.DBTest

interface DatabaseHelper {


    suspend fun deleteTest(test: DBTest)
}