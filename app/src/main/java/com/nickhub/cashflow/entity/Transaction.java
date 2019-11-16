package com.nickhub.cashflow.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Transaction {
    @PrimaryKey(autoGenerate = true)
    public int trId;

    @ColumnInfo(name = "from_account_id")
    public int fromAccId;

    @ColumnInfo(name = "to_account_id")
    public int toAccId;

    public String merchant;

    @ColumnInfo(name = "transaction_time")
    public long transactionTime;

    public float value;


}
