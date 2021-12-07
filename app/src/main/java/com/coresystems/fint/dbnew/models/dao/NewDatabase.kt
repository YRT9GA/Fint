package com.coresystems.fint.dbnew.models.dao

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import java.security.AccessControlContext




object NewDatabase {


    lateinit var instance : TestDatabase
        private set


    fun init (context: Context){
        instance = Room.databaseBuilder(context,
        TestDatabase::class.java, TestDatabase.DB_NAME)
            .createFromAsset("database/Transactions.db")
            .build()
    }

}

