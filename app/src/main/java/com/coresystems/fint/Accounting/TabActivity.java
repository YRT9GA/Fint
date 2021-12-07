package com.coresystems.fint.Accounting;



import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


import com.coresystems.fint.NavigationFragments.FragmentHome;
import com.coresystems.fint.R;
import com.google.android.material.tabs.TabLayout;

public class TabActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);


        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.tab_view_pager);

        tabLayout.setupWithViewPager(viewPager);

        AccountingViewPagerAdapter accVPAdapter = new AccountingViewPagerAdapter(getSupportFragmentManager());
        accVPAdapter.addFragment(new OutcomeAdd(), "Расход");
        accVPAdapter.addFragment(new FragmentIncomeAdd(), "Доход");
        accVPAdapter.addFragment(new LoansActivity(), "Долг");
        accVPAdapter.addFragment(new TransferActivity(), "Перевод");
        viewPager.setAdapter(accVPAdapter);
    }



}
