package com.example.listassist.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.listassist.ListItem;
import com.example.listassist.User;
import com.example.listassist.db.typeConverters.DateTypeConverter;

@Database(entities = {User.class, ListItem.class}, version = 4)
@TypeConverters(DateTypeConverter.class)
public abstract class AppDatabase extends RoomDatabase {
    public static final String DB_NAME ="LISTASSIST_DATABASE";
    public static final String USER_TABLE = "USER_TABLE";
    public static final String LIST_TABLE = "LIST_TABLE";

    public abstract ListAssistDAO getListAssistDAO();

}
