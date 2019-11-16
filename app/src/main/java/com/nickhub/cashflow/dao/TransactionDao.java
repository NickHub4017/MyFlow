package com.nickhub.cashflow.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.nickhub.cashflow.entity.Transaction;

import java.util.List;

@Dao
public interface TransactionDao {

    @Insert
    public void insert(Transaction transaction);

    @Update
    public void update(Transaction transaction);

    @Delete
    public void delete(Transaction transaction);

    @Query("Select * from `transaction`")
    public List<Transaction> getAllTransactions();

    @Query("Select * from `transaction` where transaction_time >= :startTime and transaction_time <= :endTime")
    public List<Transaction> getAllTransactionsWithIn(long startTime,long endTime);

}
