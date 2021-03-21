package com.coresystems.fint.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Category {

    @PrimaryKey
    @ColumnInfo(name = "id_category")
    public long idCategory;
    @ColumnInfo(name = "category_type")
    public String categoryType;
    @ColumnInfo(name = "name")
    public String name;
}
