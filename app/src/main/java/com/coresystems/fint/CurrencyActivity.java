package com.coresystems.fint;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CurrencyActivity extends Activity {

    String[] currency;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option_currency);


        currency = getResources().getStringArray(R.array.сurrency);

        // находим список
        ListView lvMain = (ListView) findViewById(R.id.currencylist);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, currency);

        // присваиваем адаптер списку
        lvMain.setAdapter(adapter);

    }

}
