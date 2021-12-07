
package com.coresystems.fint.db;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.coresystems.fint.db.entity.Transaction;

import java.util.List;

@Dao
public interface FintDao {

    // allowing the insert of the same word multiple times by passing a
    // conflict resolution strategy
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Transaction transaction);

    @Query("DELETE FROM `transaction`")
    void deleteAll();

    @Query("SELECT * FROM `transaction` ORDER BY 'id_transaction' ASC")
    LiveData<List<Transaction>> getTransactions();
}

