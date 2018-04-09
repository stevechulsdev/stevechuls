package com.stevechuls.copy;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FragmentMainActivity extends AppCompatActivity implements FragmentMenu.OnItemSelectedListener, FragmentGridMenu.OnItemSelectedListener {

    private ViewPager mViewPager;
    private PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpager);

        pagerAdapter = new PagerAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.view_pager);
        mViewPager.setAdapter(pagerAdapter);

        mViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
            }
        });

//        if(savedInstanceState == null)
//        {
//            FragmentMenu mFragment = new FragmentMenu();
//
//            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//            ft.add(R.id.fragment_layout, mFragment);
//            ft.commit();
//        }
    }

    @Override
    public void onItemSelected(int position) {

    }
}
