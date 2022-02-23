package com.recognitionor.mvvm_sample.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.recognitionor.mvvm_sample.data.local.dao.DBTestDao
import com.recognitionor.mvvm_sample.data.local.entity.DBTest

@Database(entities = [DBTest::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun testDao(): DBTestDao

}