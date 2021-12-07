package com.coresystems.fint;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ProfileActivity extends Activity {

    String[] profile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option_profile);


        profile = getResources().getStringArray(R.array.profile);

        // находим список
        ListView lvMain = (ListView) findViewById(R.id.profilelist);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, profile);

        // присваиваем адаптер списку
        lvMain.setAdapter(adapter);

    }

}