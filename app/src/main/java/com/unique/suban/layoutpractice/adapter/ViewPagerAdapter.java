package com.unique.suban.layoutpractice.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by Dashing on 08-May-16.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    ArrayList<Fragment> fragments;

    public ViewPagerAdapter(FragmentManager fm, ArrayList<Fragment> list) {
        super(fm);
        fragments = list;
    }

    @Override
    public Fragment getItem(int position) {
        return this.fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
