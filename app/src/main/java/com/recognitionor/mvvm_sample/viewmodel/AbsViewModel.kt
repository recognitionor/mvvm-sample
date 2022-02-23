package com.recognitionor.mvvm_sample.viewmodel

import androidx.lifecycle.ViewModel
import com.recognitionor.mvvm_sample.data.api.ApiHelper
import com.recognitionor.mvvm_sample.data.local.DatabaseHelper

abstract class AbsViewModel() : ViewModel() {

    var db: DatabaseHelper? = null
    var api: ApiHelper? = null

    constructor(databaseHelper: DatabaseHelper) : this() {
        this.db = databaseHelper
    }

    constructor(apiHelper: ApiHelper) : this() {
        this.api = apiHelper
    }

    constructor(apiHelper: ApiHelper, databaseHelper: DatabaseHelper) : this() {
        this.db = databaseHelper
        this.api = apiHelper
    }
}