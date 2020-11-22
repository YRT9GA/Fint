package com.coresystems.fint.db.entity;

import android.media.Image;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class GeneralCategory {

    @PrimaryKey
    @ColumnInfo(name = "id_general_category")
    public long idGeneralCategory;
    @ColumnInfo(name = "id_category_one")
    public long idCategoryOne;
    @ColumnInfo(name = "id_category_two")
    public long idCategoryTwo;
    @ColumnInfo(name = "is_active")
    public boolean isActive;
    @ColumnInfo(name = "icon")
    public Image icon;
}
