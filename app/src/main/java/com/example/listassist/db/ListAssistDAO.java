package com.example.listassist.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.listassist.ListItem;
import com.example.listassist.User;

import java.util.List;
/**
 *Author: Tyler Thompson & Conner Jordan
 *Date: 4/15/23
 *Description: A DAO that defines the User and ListItem.
 */
@Dao
public interface ListAssistDAO {
    @Insert
    void insert(User... users);
    @Update
    void update(User... users);

    @Delete
    void delete(User user);

    @Insert
    void insert(ListItem... listItems);
    @Update
    void update(ListItem... listItems);
    @Delete
    void delete(ListItem listAssists);

    @Query("SELECT * FROM " + AppDatabase.USER_TABLE)
    List<User> getUsers();

    @Query("SELECT * FROM " + AppDatabase.USER_TABLE + " WHERE mUsername = :username ")
    User getUserByUsername(String username);

    @Query("SELECT * FROM " + AppDatabase.USER_TABLE + " WHERE mUserID = :userID")
    User getUserByID(int userID);

    @Query("SELECT * FROM " + AppDatabase.LIST_TABLE + " WHERE mUserID = :userID")
    List<ListItem> getListItemByUserByID(int userID);

    @Query("DELETE FROM " + AppDatabase.USER_TABLE)
    void purgeUserTable();

}
