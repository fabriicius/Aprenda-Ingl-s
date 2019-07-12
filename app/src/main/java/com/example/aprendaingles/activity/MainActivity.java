package com.example.aprendaingles.activity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.aprendaingles.R;
import com.example.aprendaingles.fragment.AnimaisFragment;
import com.example.aprendaingles.fragment.NumerosFragment;
import com.example.aprendaingles.fragment.VogaisFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private SmartTabLayout smartTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //retirar elevation
        getSupportActionBar().setElevation(0);
        //Colocar Titulo
        getSupportActionBar().setTitle("Aprenda Inglês");

        viewPager = findViewById(R.id.viewpager);
        smartTabLayout = findViewById(R.id.viewpagertab);


        //Configura Adapter
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                .add("Animais", AnimaisFragment.class)
                .add("Numeros" , NumerosFragment.class)
               // .add("Vogais" , VogaisFragment.class)
                .create()
        );

        //configura abas
        viewPager.setAdapter(adapter);
        smartTabLayout.setViewPager(viewPager);

    }
}
