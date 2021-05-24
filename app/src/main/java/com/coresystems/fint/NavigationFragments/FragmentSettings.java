package com.coresystems.fint.NavigationFragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.coresystems.fint.LanguageActivity;
import com.coresystems.fint.R;

public class FragmentSettings extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_settings, container, false);

        // присваиваем интент для перехода на экран выбора языка
        TextView languageTv = root.findViewById(R.id.language_tv);
        languageTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), LanguageActivity.class);
                startActivity(in);
            }
        });


        return root;
    }
}