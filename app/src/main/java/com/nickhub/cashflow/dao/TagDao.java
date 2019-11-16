package com.nickhub.cashflow.dao;

import androidx.room.Dao;
import androidx.room.Query;

import com.nickhub.cashflow.entity.Tag;

import java.util.List;

@Dao
public interface TagDao {

    public void insertTag(Tag tag);

    public void update (Tag tag);

    public void delete(Tag tag);

    @Query("Select * from tag")
    public List<Tag> getAllTags();




}
