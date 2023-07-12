package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;

public class second extends AppCompatActivity {
    ListView listView;
    String activity[] = {"First","Second","Third"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        listView=findViewById(R.id.lv);
        ArrayAdapter adapter = new ArrayAdapter(second.this, android.R.layout.simple_list_item_1,activity);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, i, id) -> {
            if(activity[i]=="First")
            {
                Intent intent2 = new Intent(second.this,MainActivity.class);
                startActivity(intent2);
            }
            else if(activity[i]=="Second"){
                Toast.makeText(second.this, "You are already in Second activity", Toast.LENGTH_SHORT).show();
//                    Toast.makeText(MainActivity.this, "Second", Toast.LENGTH_SHORT).show();
            }
            else if (activity[i]=="Third") {
//                    Toast.makeText(MainActivity.this, "Third", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(second.this,Third.class);
                startActivity(intent3);
            }
        });
    }
}