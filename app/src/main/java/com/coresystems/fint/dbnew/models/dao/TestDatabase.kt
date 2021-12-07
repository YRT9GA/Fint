package com.coresystems.fint.dbnew.models.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.Transaction
import com.coresystems.fint.dbnew.models.AccountsEntity
import com.coresystems.fint.dbnew.models.CategoriesEntity
import com.coresystems.fint.dbnew.models.Transactions


@Database(entities = [Transactions::class, AccountsEntity::class, CategoriesEntity::class],  version = TestDatabase.DB_VERSION)
abstract class TestDatabase:RoomDatabase() {


    abstract fun TransactionsDao(): TransactionsDao
    abstract fun CategoriesDAO(): CategoriesDAO

    companion object{
        const val DB_VERSION = 1
        const val DB_NAME = "Test-database"
    }



}