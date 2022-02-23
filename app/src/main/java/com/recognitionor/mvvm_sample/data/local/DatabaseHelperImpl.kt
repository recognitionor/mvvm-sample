package com.recognitionor.mvvm_sample.data.local

import com.recognitionor.mvvm_sample.data.local.entity.DBTest
import com.recognitionor.mvvm_sample.data.local.AppDatabase
import com.recognitionor.mvvm_sample.data.local.DatabaseHelper

class DatabaseHelperImpl(private val appDatabase: AppDatabase) : DatabaseHelper {
    override suspend fun deleteTest(test: DBTest) {
    }

}