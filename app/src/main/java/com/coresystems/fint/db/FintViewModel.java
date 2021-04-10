/*
package com.coresystems.fint.db;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.coresystems.fint.db.entity.Transaction;

import java.util.List;

public class FintViewModel extends AndroidViewModel {

    private FintRepository fintRepository;
    private final LiveData<List<Transaction>> allTransactions;


    public FintViewModel(@NonNull Application application) {
        super(application);
        this.fintRepository = new FintRepository(application);
        this.allTransactions = fintRepository.getAllTransactions();
    }

    LiveData<List<Transaction>> getAllTransactions() {
        return allTransactions;
    }

    public void insert(Transaction transaction) {
        fintRepository.insert(transaction);
    }


}
*/
