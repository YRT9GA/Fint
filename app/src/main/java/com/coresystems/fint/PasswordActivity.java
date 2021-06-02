package com.coresystems.fint;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PasswordActivity extends Activity {

    String[] password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option_password);


        password = getResources().getStringArray(R.array.password);

        // находим список
        ListView lvMain = (ListView) findViewById(R.id.passwordlist);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, password);

        // присваиваем адаптер списку
        lvMain.setAdapter(adapter);

    }

}
