package com.example.shardpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView txt;
    EditText email,pass;
    Button btn;
    SharedPreferences sp;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt = findViewById(R.id.txt);
        btn = findViewById(R.id.btn);

        sp = getSharedPreferences("REG",MODE_PRIVATE);

        String get_name = sp.getString("Name","revadiyo");
        String get_email = sp.getString("Email","Email Incorect");
        String get_pass = sp.getString("Pass","Password Incorect");
        txt.setText("welcome"+get_name);

        email = findViewById(R.id.edt1);
        pass = findViewById(R.id.edt2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Enterd_email = email.getText().toString();
                String Enterd_pass = pass.getText().toString();

                if (Enterd_pass.equals(get_pass) && Enterd_email.equals(get_email)){
                    startActivity(new Intent(getApplicationContext(),MainActivity3.class));
                }
            }
        });

//        txt.setText(get_email);
//        txt.setText(get_pass);
    }
}