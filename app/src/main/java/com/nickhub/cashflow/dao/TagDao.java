package com.nickhub.cashflow.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.nickhub.cashflow.entity.Tag;

import java.util.List;

@Dao
public interface TagDao {

    @Insert
    public void insertTag(Tag tag);

    @Update
    public void update (Tag tag);

    @Delete
    public void delete(Tag tag);

    @Query("Select * from tag")
    public List<Tag> getAllTags();




}
