package com.nickhub.cashflow.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Account {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public String name;

    @ColumnInfo(name = "bank_name")
    public String bankName;

    @ColumnInfo(name = "account_no")
    public String accountNo;

    public String type;
}
