package com.example.call;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    ImageView click;
    EditText edt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click = findViewById(R.id.click);
        edt = findViewById(R.id.et2);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long number = Long.parseLong(edt.getText().toString());
//                Toast.makeText(MainActivity.this, ""+number, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_DIAL);

                intent.setData(Uri.parse("tel:"+number));
                startActivity(intent);
            }
        });
    }
}