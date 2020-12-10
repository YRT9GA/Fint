package com.coresystems.fint.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Loans {

    @PrimaryKey
    @ColumnInfo(name = "id_loan")
    public long idLoan;
    @ColumnInfo(name = "cur_code")
    public String curCode;
    @ColumnInfo(name = "id_partner")
    public long idPartner;
    @ColumnInfo(name = "loan_sum")
    public long loanSum;
    @ColumnInfo(name = "full_sum")
    public long fullSum;
    @ColumnInfo(name = "current_sum")
    public long currentSum;
    @ColumnInfo(name = "dt_start_loan")
    public long dtStartLoan;
    @ColumnInfo(name = "dt_finish_loan")
    public long dtFinishLoan;
    @ColumnInfo(name = "comment")
    public String comment;
}
