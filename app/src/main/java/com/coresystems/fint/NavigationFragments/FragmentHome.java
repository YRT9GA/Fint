package com.coresystems.fint.NavigationFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.coresystems.fint.CashAdapter;
import com.coresystems.fint.CredAdapter;
import com.coresystems.fint.CurAdapter;
import com.coresystems.fint.R;

public class FragmentHome extends Fragment {

    Button floatbtn;

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

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

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
        RecyclerView cashRecyclerView = root.findViewById(R.id.cash_recycler_View);
        CashAdapter cashAdapter = new CashAdapter(getActivity(), str1, str2);
        cashRecyclerView.setAdapter(cashAdapter);
        cashRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        RecyclerView debtRecyclerView = root.findViewById(R.id.debt_recycler_View);
        CashAdapter debtAdapter = new CashAdapter(getActivity(), str3, str4);
        debtRecyclerView.setAdapter(debtAdapter);
        debtRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        RecyclerView credRecyclerView = root.findViewById(R.id.cred_recycler_View);
        CredAdapter credAdapter = new CredAdapter(getActivity(), str5, str6, str7);
        credRecyclerView.setAdapter(credAdapter);
        credRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        RecyclerView bankRecyclerView = root.findViewById(R.id.bank_recycler_View);
        CashAdapter bankAdapter = new CashAdapter(getActivity(), str8, str9);
        bankRecyclerView.setAdapter(bankAdapter);
        bankRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        RecyclerView curRecyclerView = root.findViewById(R.id.cur_recycler_View);
        CurAdapter curAdapter = new CurAdapter(getActivity(), str10, str11, str12, images);
        curRecyclerView.setAdapter(curAdapter);
        curRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return root;
    }



    }


