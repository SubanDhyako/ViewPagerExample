package com.unique.suban.layoutpractice.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.unique.suban.layoutpractice.R;

/**
 * Created by Dashing on 05-May-16.
 */
public class CustomArrayAdapter extends ArrayAdapter {
    Context context;
    int[] img;
    String[] name,address,phone;
    public CustomArrayAdapter(Context c, String[] names, int[] images, String[] addresses, String[] phones) {
        super(c, R.layout.single_row,R.id.textName,addresses);
        this.context =c;
        this.name=names;
        this.address=addresses;
        this.img=images;
        this.phone=phones;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View row =inflater.inflate(R.layout.single_row,parent,false);

        ImageView myImage = (ImageView) row.findViewById(R.id.img);
        TextView myName = (TextView) row.findViewById(R.id.textName);
        TextView myAddress = (TextView) row.findViewById(R.id.textAddress);
        TextView myContact = (TextView) row.findViewById(R.id.phoneNo);

        myImage.setImageResource(img[position]);
        myName.setText(name[position]);
        myAddress.setText(address[position]);
        myContact.setText(phone[position]);
        return row;
    }
}
