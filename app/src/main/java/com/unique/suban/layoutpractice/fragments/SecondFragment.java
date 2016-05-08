package com.unique.suban.layoutpractice.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.unique.suban.layoutpractice.R;


public class SecondFragment extends Fragment {


    public SecondFragment() {
        // Required empty public constructor
    }


    public static SecondFragment newInstance() {
        SecondFragment fragment = new SecondFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fsecond, container, false);
    }


}
