package com.stevechuls.copy.fragment;

import android.content.ClipData;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.stevechuls.copy.R;

import java.util.ArrayList;

public class FragmentActivity extends AppCompatActivity  implements FragmentRecyclerViewMenu.OnItemSelectedListener{

    private ViewPager mViewPager;
    private FragmentPagerCustomAdapter mFragmentPagerCustomAdapter;
    private FragmentRecyclerViewAdapter mFragmentRecyclerViewAdapter;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        mFragmentPagerCustomAdapter = new FragmentPagerCustomAdapter(this.getSupportFragmentManager());


        mViewPager = (ViewPager) findViewById(R.id.fragment_viewpager);
        mViewPager.setAdapter(mFragmentPagerCustomAdapter);

        mViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
            }
        });

        mFragmentRecyclerViewAdapter = new FragmentRecyclerViewAdapter();

//        recyclerView = (RecyclerView)findViewById(R.id.fragment_widget_recyclerview);
//        recyclerView.setHasFixedSize(true);

//        ArrayList items = new ArrayList<>();
//        items.add(new FragmentItem().setDrawable(ContextCompat.getDrawable(this.getContext));
//        items.add(new Item(R.drawable.stevechuls, "ksc"));

//        layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);
//
//        mFragmentRecyclerViewAdapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.stevechuls), "ksc");
//        mFragmentRecyclerViewAdapter.notifyDataSetChanged();

//        mFragmentRecyclerViewAdapter = new FragmentRecyclerViewAdapter()
    }

    @Override
    public void onItemSelected(int position) {

    }
}
