package com.recognitionor.mvvm_sample.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.recognitionor.mvvm_sample.data.api.ApiHelper
import com.recognitionor.mvvm_sample.data.api.ParamsKeys
import com.recognitionor.mvvm_sample.data.local.DatabaseHelper
import com.recognitionor.mvvm_sample.data.local.entity.DBTest
import com.recognitionor.mvvm_sample.data.model.Test
import com.recognitionor.mvvm_sample.utils.Resource
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch


class TestViewModel(
    private val apiHelper: ApiHelper,
    private val dbHelper: DatabaseHelper
) : ViewModel() {

    private val test = MutableLiveData<Resource<Test>>()

    fun getTestWithHttp() {
        val exceptionHandler = CoroutineExceptionHandler { _, e ->
            test.postValue(Resource.error(e.toString(), null))
        }
        viewModelScope.launch(exceptionHandler) {
            val params = hashMapOf<String, Any?>().apply {
                put(ParamsKeys.KEY_TEST, "token")
            }
            apiHelper.getTest(params)
        }
    }

    fun getTestWithDB(param: DBTest) {
        val exceptionHandler = CoroutineExceptionHandler { _, e ->
            test.postValue(Resource.error(e.toString(), null))
        }
        viewModelScope.launch(exceptionHandler) {
            dbHelper.deleteTest(param)
        }
    }
}