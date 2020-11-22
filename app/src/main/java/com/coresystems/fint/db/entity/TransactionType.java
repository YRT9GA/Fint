package com.coresystems.fint.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class TransactionType {

    @PrimaryKey
    @ColumnInfo(name = "id_type_tr")
    public int idTypeTr;
    @ColumnInfo(name = "type_name")
    public String typeName;
}
