package com.coresystems.fint.dbnew.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "accounts")
data class AccountsEntity(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id:Long,
    @ColumnInfo(name = "name")
    val name:String,
    @ColumnInfo(name = "accountCategory")
    val categoryAcc:String,
    @ColumnInfo(name = "balance")
    val balance:Double
)