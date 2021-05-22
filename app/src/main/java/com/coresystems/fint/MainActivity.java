package com.coresystems.fint;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.coresystems.fint.Accounting.IncomeAdd;
import com.coresystems.fint.Accounting.LoanRaise;
import com.coresystems.fint.Accounting.LoanRepay;
import com.coresystems.fint.Accounting.OutcomeAdd;
import com.coresystems.fint.NavigationFragments.FragmentAnalytics;
import com.coresystems.fint.NavigationFragments.FragmentHome;
import com.coresystems.fint.NavigationFragments.FragmentPlan;
import com.coresystems.fint.NavigationFragments.FragmentProfile;
import com.google.android.material.bottomnavigation.BottomNavigationView;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;







public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    Button floatbtn;
    Button profilebtn;
    Button planbtn;
    Button analytbtn;


    //создаем тестовые массив для ресайкла
    String str1[];
    String str2[];
    String str3[];
    String str4[];
    String str5[];
    String str6[];
    String str7[];
    String str8[];
    String str9[];
    String str10[];
    String str11[];
    String str12[];

    int images[] = {
            R.drawable.arrow_up_1,
            R.drawable.arrow_down_1,
            };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);

        FragmentHome fragmentHome = new FragmentHome();

       FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.nav_container, fragmentHome)
                .commit();

        BottomNavigationView navigation = findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(navListener);

        final String[] ActionNamesArray = {"Расход", "Доход", "Возврат займа", "Привлечение займа"};

        // получаем экземпляр элемента ListView
        ListView listView = findViewById(R.id.languagelist);

// определяем строковый массив
        final String[] language = getResources().getStringArray(R.array.language);

// используем адаптер данных
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, language);

        listView.setAdapter(adapter);











        // присваиваем значения для массивов
//        str1 = getResources().getStringArray(R.array.cash_acc);
//        str2 = getResources().getStringArray(R.array.cash_acc_sum);
//
//        str3 = getResources().getStringArray(R.array.debt_acc);
//        str4 = getResources().getStringArray(R.array.debt_acc_sum);
//
//        str5 = getResources().getStringArray(R.array.cred_acc);
//        str6 = getResources().getStringArray(R.array.cred_acc_sum);
//        str7 = getResources().getStringArray(R.array.cred_lim);
//
//        str8 = getResources().getStringArray(R.array.bank_acc);
//        str9 = getResources().getStringArray(R.array.bank_acc_sum);
//
//        str10 = getResources().getStringArray(R.array.cur_acc);
//        str11 = getResources().getStringArray(R.array.cur_sum);
//        str12 = getResources().getStringArray(R.array.cur_exc);



        // создаем RecyclerView
//        RecyclerView cashRecyclerView = findViewById(R.id.cash_recycler_View);
//        CashAdapter cashAdapter = new CashAdapter(this, str1, str2);
//        cashRecyclerView.setAdapter(cashAdapter);
//        cashRecyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//        RecyclerView debtRecyclerView = findViewById(R.id.debt_recycler_View);
//        CashAdapter debtAdapter = new CashAdapter(this, str3, str4);
//        debtRecyclerView.setAdapter(debtAdapter);
//        debtRecyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//        RecyclerView credRecyclerView = findViewById(R.id.cred_recycler_View);
//        CredAdapter credAdapter = new CredAdapter(this, str5, str6, str7);
//        credRecyclerView.setAdapter(credAdapter);
//        credRecyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//        RecyclerView bankRecyclerView = findViewById(R.id.bank_recycler_View);
//        CashAdapter bankAdapter = new CashAdapter(this, str8, str9);
//        bankRecyclerView.setAdapter(bankAdapter);
//        bankRecyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//        RecyclerView curRecyclerView = findViewById(R.id.cur_recycler_View);
//        CurAdapter curAdapter = new CurAdapter(this, str10, str11, str12, images);
//        curRecyclerView.setAdapter(curAdapter);
//        curRecyclerView.setLayoutManager(new LinearLayoutManager(this));


        return;
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new
            BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {

                        case R.id.action_main:
                            selectedFragment = new FragmentHome();
                            break;
                        case R.id.action_analytics:
                            selectedFragment = new FragmentAnalytics();
                            break;
                        case R.id.action_plan:
                            selectedFragment = new FragmentPlan();
                            break;
                        case R.id.action_profile:
                            selectedFragment = new FragmentProfile();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.nav_container,
                            selectedFragment).commit();

                    return true;
                }
            };

//    @Override
//    public void onClick(View view){
//        AlertDialog.Builder a_builder = new AlertDialog.Builder(this);
//        a_builder.setCancelable(false)
//                .setPositiveButton("Доход", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int which) {
//                        Intent intent = new Intent(MainActivity.this, IncomeAdd.class);
//                                 startActivity(intent);
//                    }
//                })
//                .setNegativeButton("Расход", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int which) {
//                        Intent intent = new Intent(MainActivity.this, OutcomeAdd.class);
//                        startActivity(intent);
//                    }
//                })
//                .setNeutralButton("Возврат займа", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int which) {
//                        Intent intent = new Intent(MainActivity.this, OutcomeAdd.class);
//                        startActivity(intent);
//                    }
//                })
//                .setNeutralButton("Привлечение займа", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int which) {
//                        Intent intent = new Intent(MainActivity.this, OutcomeAdd.class);
//                        startActivity(intent);
//                    }
//                });
//        AlertDialog alertDialog = a_builder.create();
//        alertDialog.setTitle("Выберите действие");
//        alertDialog.show();
//
//    }

    @Override
    public void onClick(View view) {
        AlertDialog.Builder a_builder = new AlertDialog.Builder(this);
        a_builder.setTitle("Выберите действие");
        a_builder.setItems(new CharSequence[]
                        {"Расход", "Доход", "Возврат займа", "Привлечение займа"},
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // The 'which' argument contains the index position
                        // of the selected item
                        switch (which) {
                            case 0:
                                Intent intent = new Intent(MainActivity.this, OutcomeAdd.class);
                        startActivity(intent);
                            break;
                            case 1:
                                Intent intent2 = new Intent(MainActivity.this, IncomeAdd.class);
                        startActivity(intent2);
                            break;
                            case 2:
                                Intent intent3 = new Intent(MainActivity.this, LoanRepay.class);
                        startActivity(intent3);
                            break;
                            case 3:
                                Intent intent4 = new Intent(MainActivity.this, LoanRaise.class);
                        startActivity(intent4);
                            break;
                        }
                    }
                });
        a_builder.create().show();
    }



//        @Override
 //       public void onClick(View view){
  //          Intent intent = new Intent(MainActivity.this, IncomeAdd.class);
   //         startActivity(intent);
   //     }


//        public void ProfileClick(View view){
//            FragmentProfile fragmentProfile = new FragmentProfile();
//            FragmentManager fragmentManager = getSupportFragmentManager();
//            fragmentManager.beginTransaction()
//                    .replace(R.id.nav_container, fragmentProfile)
//                    .commit();
//    }






    }

