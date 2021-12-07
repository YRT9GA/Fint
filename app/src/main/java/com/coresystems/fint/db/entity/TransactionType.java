
package com.coresystems.fint.db.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class TransactionType {

    @PrimaryKey
    @ColumnInfo(name = "id_type_tr")
    private int idTypeTr;
    @ColumnInfo(name = "type_name")
    private String typeName;

    public TransactionType(int idTypeTr, @NonNull String typeName) {
        this.idTypeTr = idTypeTr;
        this.typeName = typeName;
    }
}

