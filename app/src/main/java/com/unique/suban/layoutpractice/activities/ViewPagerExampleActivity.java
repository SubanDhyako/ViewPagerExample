package com.unique.suban.layoutpractice.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.unique.suban.layoutpractice.R;
import com.unique.suban.layoutpractice.adapter.ViewPagerAdapter;
import com.unique.suban.layoutpractice.fragments.FisrtFragment;
import com.unique.suban.layoutpractice.fragments.SecondFragment;

import java.util.ArrayList;

public class ViewPagerExampleActivity extends AppCompatActivity {
    ViewPager mViewPager;
    ViewPagerAdapter mViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_example);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);

        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new FisrtFragment());
        fragments.add(new SecondFragment());
        mViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), fragments);
        mViewPager.setAdapter(mViewPagerAdapter);
    }
}
