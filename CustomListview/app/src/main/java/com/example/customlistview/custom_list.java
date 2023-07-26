package com.example.customlistview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class custom_list extends BaseAdapter {
    Context c;
    String [] title;
    String [] disc;
    int [] img;
    LayoutInflater inflater;
    public custom_list(Context applicationContext, String[] title, String[] disc, int[] img) {

        this.c = applicationContext;
        this.title = title;
        this.disc = disc;
        this.img = img;
        inflater = LayoutInflater.from(c);
    }

    @Override
    public int getCount() {
        return img.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.row,parent,false);
        TextView tx1 = convertView.findViewById(R.id.t1);
        TextView tx2 = convertView.findViewById(R.id.d1);
        ImageView img1 = convertView.findViewById(R.id.img1);
        ImageView img2 = convertView.findViewById(R.id.img2);

        tx1.setText(title[position]);
        tx2.setText(disc[position]);
        img1.setImageResource(img[position]);
        img2.setImageResource(img[position]);

        return convertView;
    }
}
