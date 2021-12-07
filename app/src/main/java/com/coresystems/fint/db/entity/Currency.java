
package com.coresystems.fint.db.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Currency {

    @PrimaryKey
    @ColumnInfo(name = "cur_code")
    @NonNull
    private String curCode;
    @ColumnInfo(name = "cur_short_code")
    private String curShortName;
    @ColumnInfo(name = "cur_full_name")
    private String curFullName;

    public Currency(String curCode, String curShortName, String curFullName) {
        this.curCode = curCode;
        this.curShortName = curShortName;
        this.curFullName = curFullName;
    }

    public String getCurCode() {
        return curCode;
    }

    public String getCurShortName() {
        return curShortName;
    }

    public String getCurFullName() {
        return curFullName;
    }

}

