package com.coresystems.fint.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Partner {

    @PrimaryKey
    @ColumnInfo(name = "id_partner")
    public long idPartner;
    @ColumnInfo(name = "partner_name")
    public String partnerName;
}
