package com.nickhub.cashflow.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "tag_transaction_join",
        primaryKeys = {"tag_id","transaction_id"},
        foreignKeys = {
                    @ForeignKey(entity = Transaction.class,parentColumns = "tr_id",childColumns = "transaction_id"),
                    @ForeignKey(entity = Tag.class,parentColumns = "id",childColumns = "tag_id")
        })
public class TagTransactionJoin {

    @ColumnInfo(name = "tag_id")
    public int tagId;
    @ColumnInfo(name = "transaction_id")
    public int transactionID;
}
