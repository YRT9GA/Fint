package com.coresystems.fint.db.entity;


import androidx.room.PrimaryKey;

@androidx.room.Entity
public class Employee {
    @PrimaryKey
    public long id;

    public String name;

    public int salary;
}
