package com.nickhub.cashflow.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.nickhub.cashflow.entity.TagTransactionJoin;

import java.util.List;

@Dao
public interface TagTransactionDao {

    @Insert
    void insert (TagTransactionJoin tagTransactionJoin);

    @Update
    void update(TagTransactionJoin tagTransactionJoin);

    @Delete
    void delete (TagTransactionJoin tagTransactionJoin);

    @Query("Select * from tag_transaction_join")
    List<TagTransactionJoin> getAllTagTransactionLinks();

    @Query("Select * from tag_transaction_join where transaction_id= :transactionId")
    List<TagTransactionJoin> getAllTagTransactionLinksFromTrID(int transactionId);


    @Query("Select * from tag_transaction_join where tag_id= :tagId")
    List<TagTransactionJoin> getAllTagTransactionLinksfromTagID(int tagId);


}
