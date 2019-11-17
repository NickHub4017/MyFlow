package com.nickhub.cashflow.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

@Entity
public class TransactionImage {

    public int id;

    @ColumnInfo(name = "tr_id")
    public int trId;

    @ColumnInfo(name ="image_string")
    public String imageString;
}
