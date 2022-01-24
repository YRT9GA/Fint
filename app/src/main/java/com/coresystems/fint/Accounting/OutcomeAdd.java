package com.coresystems.fint.Accounting;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.coresystems.fint.R;
import com.coresystems.fint.dbnew.models.dao.NewDatabase;

public class OutcomeAdd extends Fragment {


    String[] outcomeCategory;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_outcome_add, container, false);



        outcomeCategory = NewDatabase.INSTANCE.getInstance().CategoriesDAO()
                .getAllOutcomeNameCategories().toArray(new String[0]);

        Spinner spinner = (Spinner) root.findViewById(R.id.spin_cat_out);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_spinner_item, outcomeCategory);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
//        initspinnerfooter();

        return root;
    }

//    private void initspinnerfooter() {
//        String[] items = new String[]{
//                "Choose apple", "Choose boy", " Choose cat", "Choose dog",
//        };
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, items);
//        spinCat.setAdapter(adapter);
//        spinCat.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                Log.v("item", (String) parent.getItemAtPosition(position));
//                ((TextView) parent.getChildAt(0)).setTextColor(Color.WHITE);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                // TODO Auto-generated method stub
//            }
//        });
//    }
}
