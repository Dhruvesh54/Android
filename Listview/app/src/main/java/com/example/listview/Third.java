package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Third extends AppCompatActivity {

    ListView listView;
    String activity[] = {"First","Second","Third"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        listView=findViewById(R.id.lv);
        ArrayAdapter adapter = new ArrayAdapter(Third.this, android.R.layout.simple_list_item_1,activity);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, i, id) -> {
            if(activity[i]=="First") {
                Intent intent3 = new Intent(Third.this,MainActivity.class);
                startActivity(intent3);
            }
            else if(activity[i]=="Second"){
                Intent intent2 = new Intent(Third.this,second.class);
                startActivity(intent2);
//                    Toast.makeText(MainActivity.this, "Second", Toast.LENGTH_SHORT).show();
            }
            else if (activity[i]=="Third") {
//                    Toast.makeText(MainActivity.this, "Third", Toast.LENGTH_SHORT).show();
                Toast.makeText(Third.this, "You are already in Third activity", Toast.LENGTH_SHORT).show();

            }
        });
    }
}