package com.coresystems.fint.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Account {

    @PrimaryKey
    @ColumnInfo(name = "id_account")
    private final long idAccount;
    @ColumnInfo(name = "id_cur")
    private int idCur;
    @ColumnInfo(name = "account_name")
    private String accountName;
    @ColumnInfo(name = "current_value")
    private long CurrentValue;

    public Account(long idAccount) {
        this.idAccount = idAccount;
    }
}
