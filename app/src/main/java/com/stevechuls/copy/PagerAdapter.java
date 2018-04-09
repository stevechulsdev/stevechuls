package com.stevechuls.copy;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.GridView;

/**
 * Created by entermate_ksc on 2018. 4. 6..
 */

public class PagerAdapter extends FragmentPagerAdapter {

    private FragmentMenu fragmentMenu;
    private FragmentGridMenu fragmentGridMenu;

    public PagerAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:
                fragmentMenu = new FragmentMenu();
                return fragmentMenu;

            case 1:
                fragmentGridMenu = new FragmentGridMenu();
                return fragmentGridMenu;

            default:
                fragmentGridMenu = new FragmentGridMenu();
                return fragmentGridMenu;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }


}
