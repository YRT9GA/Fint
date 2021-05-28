package com.coresystems.fint;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CurrencyList extends Activity {

    String[] currency = { "Рубли", "Доллары", "Евро" };

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.currency);

        // находим список
        ListView lvMain = (ListView) findViewById(R.id.languagelist);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, currency);

        // присваиваем адаптер списку
        lvMain.setAdapter(adapter);
    }
}
