package com.coresystems.fint;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


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

        // присваиваем значения для массивов
        str1 = getResources().getStringArray(R.array.cash_acc);
        str2 = getResources().getStringArray(R.array.cash_acc_sum);

        str3 = getResources().getStringArray(R.array.debt_acc);
        str4 = getResources().getStringArray(R.array.debt_acc_sum);

        str5 = getResources().getStringArray(R.array.cred_acc);
        str6 = getResources().getStringArray(R.array.cred_acc_sum);
        str7 = getResources().getStringArray(R.array.cred_lim);

        str8 = getResources().getStringArray(R.array.bank_acc);
        str9 = getResources().getStringArray(R.array.bank_acc_sum);

        str10 = getResources().getStringArray(R.array.cur_acc);
        str11 = getResources().getStringArray(R.array.cur_sum);
        str12 = getResources().getStringArray(R.array.cur_exc);






        // создаем RecyclerView
        RecyclerView cashRecyclerView = findViewById(R.id.cash_recycler_View);
        CashAdapter cashAdapter = new CashAdapter(this, str1, str2);
        cashRecyclerView.setAdapter(cashAdapter);
        cashRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        RecyclerView debtRecyclerView = findViewById(R.id.debt_recycler_View);
        CashAdapter debtAdapter = new CashAdapter(this, str3, str4);
        debtRecyclerView.setAdapter(debtAdapter);
        debtRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        RecyclerView credRecyclerView = findViewById(R.id.cred_recycler_View);
        CredAdapter credAdapter = new CredAdapter(this, str5, str6, str7);
        credRecyclerView.setAdapter(credAdapter);
        credRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        RecyclerView bankRecyclerView = findViewById(R.id.bank_recycler_View);
        CashAdapter bankAdapter = new CashAdapter(this, str8, str9);
        bankRecyclerView.setAdapter(bankAdapter);
        bankRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        RecyclerView curRecyclerView = findViewById(R.id.cur_recycler_View);
        CurAdapter curAdapter = new CurAdapter(this, str10, str11, str12, images);
        curRecyclerView.setAdapter(curAdapter);
        curRecyclerView.setLayoutManager(new LinearLayoutManager(this));


        return;


    }


}