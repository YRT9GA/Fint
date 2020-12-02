package com.coresystems.fint.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Partner {

    @PrimaryKey
    @ColumnInfo(name = "id_partner")
    private long idPartner;
    @ColumnInfo(name = "partner_name")
    private String partnerName;

    public Partner(long idPartner, String partnerName) {
        this.idPartner = idPartner;
        this.partnerName = partnerName;
    }
}
