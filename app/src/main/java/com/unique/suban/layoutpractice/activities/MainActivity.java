package com.unique.suban.layoutpractice.activities;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.unique.suban.layoutpractice.R;
import com.unique.suban.layoutpractice.adapter.CustomArrayAdapter;

public class MainActivity extends AppCompatActivity {
    String[] name,address;
    String[] contact;
    int[] imgs={R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4,
            R.drawable.img5,R.drawable.img6, R.drawable.img7, R.drawable.img8,
            R.drawable.img9, R.drawable.img10};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources resources=getResources();
        name = resources.getStringArray(R.array.names);
        address = resources.getStringArray(R.array.address);
        contact = resources.getStringArray(R.array.phone);


        listView=(ListView) findViewById(R.id.list);
        CustomArrayAdapter adapter= new CustomArrayAdapter(this,name,imgs,address,contact);
        listView.setAdapter(adapter);

    }
}
