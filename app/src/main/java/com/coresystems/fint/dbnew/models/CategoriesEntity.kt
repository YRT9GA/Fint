package com.coresystems.fint.dbnew.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = CategoriesContract.TABLE_NAME)
data class CategoriesEntity(
    @PrimaryKey
    @ColumnInfo(name = CategoriesContract.Columns.ID)
    val id: Long,
    @ColumnInfo(name = CategoriesContract.Columns.name)
    val name: String,
    @ColumnInfo(name = CategoriesContract.Columns.isOutcome)
    val isOutcome: Boolean
)