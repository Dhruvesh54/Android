package com.example.shardpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit,edit2,edit3;
    Button btn;
    SharedPreferences.Editor editor;
    SharedPreferences sp;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit = findViewById(R.id.edt1);
        edit2 = findViewById(R.id.edt2);
        edit3 = findViewById(R.id.edt3);

        btn = findViewById(R.id.btn);
//database
//        sp = getSharedPreferences("DKpatel",MODE_PRIVATE);
        sp = getSharedPreferences("REG",MODE_PRIVATE);

        editor = sp.edit();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edit.getText().toString();
                String email = edit2.getText().toString();
                String pass = edit3.getText().toString();

                editor.putString("Name",name);
                editor.putString("Email",email);
                editor.putString("Pass",pass);

                Toast.makeText(MainActivity.this, "Data Entered", Toast.LENGTH_SHORT).show();
                editor.apply();

                startActivity(new Intent(getApplicationContext(),MainActivity2.class));

            }
        });
    }
}