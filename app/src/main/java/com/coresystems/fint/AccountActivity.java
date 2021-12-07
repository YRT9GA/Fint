package com.coresystems.fint;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.coresystems.fint.db.entity.Account;

public class AccountActivity extends Activity {

    String[] account;
    Button addBtn;
    //для блокировки двойного клика на кнопку
    private long mLastClickTime = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option_account);


        account = getResources().getStringArray(R.array.account);

        // находим список
        ListView lvMain = (ListView) findViewById(R.id.accountlist);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, account);

        // присваиваем адаптер списку
        lvMain.setAdapter(adapter);

        addBtn = findViewById(R.id.add_acc_btn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mis-clicking prevention, using threshold of 1000 ms
                if (SystemClock.elapsedRealtime() - mLastClickTime < 1000){
                    return;
                }
                mLastClickTime = SystemClock.elapsedRealtime();
                Intent intent = new Intent(AccountActivity.this, AddAccountActivity.class);
                startActivity(intent);

            }
        });

    }

}