package com.coresystems.fint.dbnew.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = TransactionsContract.TABLE_NAME)
data class Transactions(
    @PrimaryKey
    @ColumnInfo(name = TransactionsContract.Columns.ID)
    val id:Long,
    @ColumnInfo(name = TransactionsContract.Columns.account)
    val account: String,
    @ColumnInfo(name = TransactionsContract.Columns.balance)
    val balance: Long,
    @ColumnInfo(name = TransactionsContract.Columns.category)
    val category: String,
    @ColumnInfo(name = TransactionsContract.Columns.incomeOutcome)
    val incomeOutcome: Long,
    @ColumnInfo(name = TransactionsContract.Columns.sum)
    val sum: Long,
    @ColumnInfo(name = TransactionsContract.Columns.date)
    val date : String,
    @ColumnInfo(name = TransactionsContract.Columns.commentary)
    val commentary : String)
