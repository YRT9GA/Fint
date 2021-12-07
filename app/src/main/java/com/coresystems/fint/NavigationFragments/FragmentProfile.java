package com.coresystems.fint.NavigationFragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.coresystems.fint.AccountActivity;
import com.coresystems.fint.CattegoryActivity;
import com.coresystems.fint.CurrencyActivity;
import com.coresystems.fint.LanguageActivity;
import com.coresystems.fint.PasswordActivity;
import com.coresystems.fint.ProfileActivity;
import com.coresystems.fint.R;

public class FragmentProfile extends Fragment {

    TextView langTv;
    TextView passwordTv;
    TextView currencyTv;
    TextView categoryTv;
    TextView profileTv;
    TextView accountTv;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_profile, container, false);



            passwordTv = root.findViewById(R.id.password_tv);

            passwordTv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), PasswordActivity.class);
                    startActivity(intent);
                }
            });

        ;



        categoryTv = root.findViewById(R.id.cattegory_tv);

        categoryTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CattegoryActivity.class);
                startActivity(intent);
            }
        });

        profileTv = root.findViewById(R.id.profile_tv);

        profileTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ProfileActivity.class);
                startActivity(intent);
            }
        });
        accountTv = root.findViewById(R.id.account_tv);

        accountTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AccountActivity.class);
                startActivity(intent);
            }
        });

        return root;
    }
}
