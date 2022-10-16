package com.mbairo.hospitalpequenoprincipe;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.mbairo.hospitalpequenoprincipe.adapters.MyPagerAdapter;

public class PosConsulta extends AppCompatActivity implements TabLayout.OnTabSelectedListener {
    private TabLayout tabLyout_titleBar;
    private ViewPager2 viewPager2_posConsulta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pos_consulta);
        getSupportActionBar().hide();

        tabLyout_titleBar = findViewById(R.id.tabLyout_titleBar);
        viewPager2_posConsulta = findViewById(R.id.viewPager2_posConsulta);
        FragmentManager manager = getSupportFragmentManager();
        MyPagerAdapter adapter = new MyPagerAdapter(manager, getLifecycle());
        viewPager2_posConsulta.setAdapter(adapter);

        tabLyout_titleBar.addTab(tabLyout_titleBar.newTab().setText("Orientações"));
        tabLyout_titleBar.addTab(tabLyout_titleBar.newTab().setText("Sintomas"));
        tabLyout_titleBar.addTab(tabLyout_titleBar.newTab().setText("Dieta"));

        tabLyout_titleBar.addOnTabSelectedListener(this);

        viewPager2_posConsulta.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLyout_titleBar.selectTab(tabLyout_titleBar.getTabAt(position));
            }
        });
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager2_posConsulta.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}