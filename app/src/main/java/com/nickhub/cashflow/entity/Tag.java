package com.nickhub.cashflow.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Tag {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "tag_name")
    public String tagName;


}
