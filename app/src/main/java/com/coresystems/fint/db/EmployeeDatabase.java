package com.coresystems.fint.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.coresystems.fint.db.entity.Employee;


@Database(entities = {Employee.class}, version = 1)
public abstract class EmployeeDatabase extends RoomDatabase {
    public abstract Dao Dao();






}
