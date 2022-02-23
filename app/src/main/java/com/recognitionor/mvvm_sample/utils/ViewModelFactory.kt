package com.recognitionor.mvvm_sample.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.adiscope.kkpoint_android.data.local.PreferencesHelper
import com.recognitionor.mvvm_sample.data.api.ApiHelper
import com.recognitionor.mvvm_sample.data.local.DatabaseHelper
import com.recognitionor.mvvm_sample.viewmodel.TestViewModel

class ViewModelFactory(
    private val apiHelper: ApiHelper,
    private val dbHelper: DatabaseHelper,
    private val preferenceHelper: PreferencesHelper? = null
) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TestViewModel::class.java)) {
            return TestViewModel(apiHelper, dbHelper) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}