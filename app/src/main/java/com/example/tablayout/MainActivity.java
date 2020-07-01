package com.example.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpTabLayout();
    }


    public void setUpTabLayout()
    {
        PagerAdapter adapter=new PagerAdapter(getSupportFragmentManager());
        adapter.setFragments(new CallsFragment(),"Chat");
        adapter.setFragments(new CharFragment(),"Status");
        adapter.setFragments(new StatusFragment(),"Calls");
        ViewPager viewPager=(ViewPager)findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        TabLayout tabLayout=(TabLayout)findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }
}