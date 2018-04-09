package com.stevechuls.copy.fragment;

import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by entermate_ksc on 2018. 4. 9..
 */

public class FragmentPagerCustomAdapter extends FragmentPagerAdapter {

    private FragmentRecyclerViewMenu mFragmentRecyclerViewMenu;

    public FragmentPagerCustomAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:
                mFragmentRecyclerViewMenu = new FragmentRecyclerViewMenu();
                return mFragmentRecyclerViewMenu;

            case 1:
                mFragmentRecyclerViewMenu = new FragmentRecyclerViewMenu();
                return mFragmentRecyclerViewMenu;

            case 2:
                mFragmentRecyclerViewMenu = new FragmentRecyclerViewMenu();
                return mFragmentRecyclerViewMenu;

            default:
                mFragmentRecyclerViewMenu = new FragmentRecyclerViewMenu();
                return mFragmentRecyclerViewMenu;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
