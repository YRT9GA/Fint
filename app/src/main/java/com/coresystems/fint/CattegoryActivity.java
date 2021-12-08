package com.coresystems.fint;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.coresystems.fint.dbnew.models.CategoriesContract;
import com.coresystems.fint.dbnew.models.CategoriesEntity;
import com.coresystems.fint.dbnew.models.dao.CategoriesDAO;
import com.coresystems.fint.dbnew.models.dao.NewDatabase;

public class CattegoryActivity extends Activity {

    String[] cattegory;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option_cattegory);

        cattegory = NewDatabase.INSTANCE.getInstance().CategoriesDAO()
                .getAllNameCategories().toArray(new String[0]);


       // cattegory = getResources().getStringArray(R.array.cattegory);

        // находим список
        ListView lvMain = (ListView) findViewById(R.id.cattegorylist);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, cattegory);

        // присваиваем адаптер списку
        lvMain.setAdapter(adapter);

    }

}