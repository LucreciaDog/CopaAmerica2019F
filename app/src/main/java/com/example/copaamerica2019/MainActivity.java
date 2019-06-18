package com.example.copaamerica2019;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        //Addd Fragment
        adapter.AddFragment(new FragmentPlay(),"PARTIDOS");
        adapter.AddFragment(new FragmentJugador(),"EQUIPOS");
        adapter.AddFragment(new FragmentEquipos(),"POSICIONES");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        //Add Icon
//        tabLayout.getTabAt(0).setIcon(R.drawable.ic_casino);
//        tabLayout.getTabAt(1).setIcon(R.drawable.ic_poll);

    }
}
