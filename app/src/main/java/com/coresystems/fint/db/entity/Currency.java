package com.coresystems.fint.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Currency {

    @PrimaryKey
    @ColumnInfo(name = "cur_code")
    public String curCode;
    @ColumnInfo(name = "cur_short_code")
    public String curShortName;
    @ColumnInfo(name = "cur_full_name")
    public String curFullName;
}
