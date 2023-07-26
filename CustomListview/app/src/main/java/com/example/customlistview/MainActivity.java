package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.helper.widget.Carousel;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l = findViewById(R.id.lv);

        String title[] = {"Instagram", "Twitter", "Linkedin", "Discord", "Whatsapp", "Spotify"};
        String disc[] = {"This is a Instagram", "This is a Twitter", "This is a Linkedin", "This is a Discord", "This is a Whathapp", "This is a Spotify"};
        int img[] = {R.drawable.c,R.drawable.d,R.drawable.b,R.drawable.e,R.drawable.a,R.drawable.f};

        custom_list adapter = new custom_list(getApplicationContext(),title,disc,img);
        l.setAdapter(adapter);
    }
}