/*

package com.coresystems.fint.db;

import android.content.Context;
import android.provider.SyncStateContract;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.coresystems.fint.db.entity.Account;
import com.coresystems.fint.db.entity.Category;
import com.coresystems.fint.db.entity.Currency;
import com.coresystems.fint.db.entity.GeneralCategory;
import com.coresystems.fint.db.entity.Loans;
import com.coresystems.fint.db.entity.Partner;
import com.coresystems.fint.db.entity.Transaction;
import com.coresystems.fint.db.entity.TransactionType;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Classes annotated with @Entity.
@Database(entities = {Account.class, Category.class, Currency.class, GeneralCategory.class,
        Loans.class, Partner.class, Transaction.class, TransactionType.class},
        version = 1, exportSchema = false)
public abstract class FintDatabase extends RoomDatabase {

    public abstract FintDao getFintDao();

    private static FintDatabase fintDB;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public static FintDatabase getInstance(Context context) {
        if (fintDB == null) fintDB = buildDatabaseInstance(context);
        return fintDB;
    }

    private static FintDatabase buildDatabaseInstance(Context context) {
        return Room.databaseBuilder(context,
                FintDatabase.class,
                "fint_database")
                .addCallback(sRoomDatabaseCallback)
                .build();
    }

    private static RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);

            databaseWriteExecutor.execute(() -> {
                // Populate the database in the background.
                // If you want to start with more transactions, just add them.
                FintDao dao = fintDB.getFintDao();
                dao.deleteAll();

                Transaction transaction = new Transaction(0);
                dao.insert(transaction);
                transaction = new Transaction(1);
                dao.insert(transaction);
                


            });
        }

    };

//        // SongDao is a class annotated with @Dao.
//        abstract public SongDao getSongDao();
//        // AlbumDao is a class annotated with @Dao.
//        abstract public ArtistDao getArtistDao();
//        // SongAlbumDao is a class annotated with @Dao.
//        abstract public SongAlbumDao getSongAlbumDao();
//    Account testAccount = new Account(1,1,"Тинько",150000);



}
*/

