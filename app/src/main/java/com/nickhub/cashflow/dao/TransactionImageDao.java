package com.nickhub.cashflow.dao;

import androidx.room.Insert;
import androidx.room.Query;

import com.nickhub.cashflow.entity.TransactionImage;

import java.util.List;

public interface TransactionImageDao {

    @Insert
    public void insert(TransactionImage transactionImage);

    @Insert
    public void update(TransactionImage transactionImage);

    @Insert
    public void delete(TransactionImage transactionImage);

    @Query("Select * from transactionimage")
    public List<TransactionImage> getAllImages();

    @Query("Select * from transactionimage where tr_id= :transactionId")
    public List<TransactionImage> getImagesByTrID(int transactionId);

}
