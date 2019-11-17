package com.nickhub.cashflow.entity;

import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Relation;

@Entity
public class TransactionAccountTagImage {

    @Embedded
    public Transaction transaction;

    @Relation(entity = Account.class, parentColumn = "id", entityColumn = "fromAccId")
    public Account fromAccount;

    @Relation(entity = Account.class, parentColumn = "id", entityColumn = "toAccId")
    public Account toAccount;





}
