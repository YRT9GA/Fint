package com.coresystems.fint;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CattegoryActivity extends Activity {

    String[] cattegory;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option_cattegory);


        cattegory = getResources().getStringArray(R.array.cattegory);

        // находим список
        ListView lvMain = (ListView) findViewById(R.id.cattegorylist);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, cattegory);

        // присваиваем адаптер списку
        lvMain.setAdapter(adapter);

    }

}