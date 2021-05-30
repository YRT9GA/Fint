package com.coresystems.fint;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AccountActivity extends Activity {

    String[] account;


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

    }

}