package com.recognitionor.mvvm_sample.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Test(
    @SerializedName("test")
    var test: String
) :  Parcelable