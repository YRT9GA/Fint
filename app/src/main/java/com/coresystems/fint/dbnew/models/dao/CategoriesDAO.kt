package com.coresystems.fint.dbnew.models.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.coresystems.fint.dbnew.models.CategoriesContract
import com.coresystems.fint.dbnew.models.CategoriesEntity
import com.coresystems.fint.dbnew.models.Transactions
import com.coresystems.fint.dbnew.models.TransactionsContract

@Dao
interface CategoriesDAO {

    @Query("SELECT * FROM ${CategoriesContract.TABLE_NAME}")
    fun getAllCategories():List<CategoriesEntity>

    @Query("SELECT  name FROM ${CategoriesContract.TABLE_NAME}")
    fun getAllNameCategories():List<String>

    @Query("SELECT name FROM ${CategoriesContract.TABLE_NAME} WHERE isOutcome > 0")
    fun getAllOutcomeNameCategories():List<String>

    @Query("SELECT name FROM ${CategoriesContract.TABLE_NAME} WHERE isOutcome < 1")
    fun getAllIncomeNameCategories():List<String>

    @Insert(entity = CategoriesEntity::class, onConflict = OnConflictStrategy.IGNORE)
    fun addCategories(categoriesEntity: CategoriesEntity)

    @Query("DELETE FROM ${CategoriesContract.TABLE_NAME}")
    fun deleteAllCategories();

}