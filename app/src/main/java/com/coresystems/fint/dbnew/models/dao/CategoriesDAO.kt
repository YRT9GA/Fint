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

    @Insert(entity = CategoriesEntity::class, onConflict = OnConflictStrategy.IGNORE)
    fun addCategories(categoriesEntity: CategoriesEntity)

    @Query("DELETE FROM ${CategoriesContract.TABLE_NAME}")
    fun deleteAllCategories();

}