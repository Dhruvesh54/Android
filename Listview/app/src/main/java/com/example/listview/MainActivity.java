package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String activity[] = {"First","Second","Third"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.lv);
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,activity);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                if(activity[i]=="First")
                {
                    Toast.makeText(MainActivity.this, "You are already in First activity", Toast.LENGTH_SHORT).show();
                }
                else if(activity[i]=="Second"){
                    Intent intent2 = new Intent(MainActivity.this,second.class);
                    startActivity(intent2);
//                    Toast.makeText(MainActivity.this, "Second", Toast.LENGTH_SHORT).show();
                }
                else if (activity[i]=="Third") {
//                    Toast.makeText(MainActivity.this, "Third", Toast.LENGTH_SHORT).show();

                    Intent intent3 = new Intent(MainActivity.this,Third.class);
                    startActivity(intent3);
                }
            }
        });



    }
}