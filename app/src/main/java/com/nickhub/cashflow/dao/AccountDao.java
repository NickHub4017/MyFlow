package com.nickhub.cashflow.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.nickhub.cashflow.entity.Account;

import java.util.List;

@Dao
public interface AccountDao {

    @Insert(onConflict = OnConflictStrategy.ABORT)
    void insert(Account account);

    @Query("Select * from account")
    List<Account> getAllAccounts();

    @Query("Select * from account where bank_name like :bankName")
    List<Account> getAllAccountsByBank(final String bankName);

    @Update
    void update(Account bankAccount);

    @Delete
    void delete (Account bankAccount);

}
