package com.coresystems.fint.db;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.coresystems.fint.db.entity.Transaction;

import java.util.List;

public class FintRepository {

    private FintDao fintDao;
    private LiveData<List<Transaction>> allTransactions;

    // Note that in order to unit test the WordRepository, you have to remove the Application
    // dependency. This adds complexity and much more code, and this sample is not about testing.
    // See the BasicSample in the android-architecture-components repository at
    // https://github.com/googlesamples
    public FintRepository(Application application) {
        FintDatabase db = FintDatabase.getInstance(application);
        this.fintDao = db.getFintDao();
        this.allTransactions = fintDao.getTransactions();
    }

    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    LiveData<List<Transaction>> getAllTransactions() {
        return this.allTransactions;
    }

    // You must call this on a non-UI thread or your app will throw an exception. Room ensures
    // that you're not doing any long running operations on the main thread, blocking the UI.
    void insert(Transaction transaction) {
        FintDatabase.databaseWriteExecutor.execute(() -> fintDao.insert(transaction));
    }
}
