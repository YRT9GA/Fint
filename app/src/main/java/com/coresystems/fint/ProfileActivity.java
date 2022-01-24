package com.coresystems.fint;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

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


        Spinner spinner = (Spinner) findViewById(R.id.spin_cat_in);


        ArrayAdapter<String> spinAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.category));
        spinAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinAdapter);

    }

}