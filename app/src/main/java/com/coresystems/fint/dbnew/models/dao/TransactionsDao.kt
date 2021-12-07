package com.coresystems.fint.dbnew.models.dao

import androidx.room.*
import androidx.room.OnConflictStrategy.IGNORE
import com.coresystems.fint.dbnew.models.Transactions
import com.coresystems.fint.dbnew.models.TransactionsContract


@Dao
interface TransactionsDao {

    @Query("SELECT * FROM ${TransactionsContract.TABLE_NAME}")
    fun getAllTransactions():List<Transactions>

    @Insert(entity = Transactions::class, onConflict = IGNORE)
    fun addTransactions(transactionsEntity: Transactions)

    @Query("DELETE FROM ${TransactionsContract.TABLE_NAME}")
    fun deleteAll();

}