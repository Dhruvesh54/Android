package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout la;
    TextView lv;
    Button btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        la = findViewById(R.id.la);
        lv = findViewById(R.id.lv);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this,btn);
                popupMenu.getMenuInflater().inflate(R.menu.opmenu,popupMenu.getMenu());
                popupMenu.show();

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        int select_menu = item.getItemId();

                        if (select_menu == R.id.red){
                            la.setBackgroundColor(Color.RED);
                        }
                        if (select_menu == R.id.blue){
                            la.setBackgroundColor(Color.BLUE);
                        }
                        if (select_menu == R.id.black){
                            la.setBackgroundColor(Color.BLACK);
                        }
                        if (select_menu == R.id.gray){
                            la.setBackgroundColor(Color.GRAY);
                        }
                        if (select_menu == R.id.yellow){
                            la.setBackgroundColor(Color.YELLOW);
                        }
                        if (select_menu == R.id.reset){
                            la.setBackgroundColor(Color.TRANSPARENT);
                        }
                        return true;
                    }
                });
            }
        });

        registerForContextMenu(lv);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.opmenu,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem m) {
        int select_menu = m.getItemId();


        if (select_menu == R.id.red){
            la.setBackgroundColor(Color.RED);
        }
        if (select_menu == R.id.blue){
            la.setBackgroundColor(Color.BLUE);
        }
        if (select_menu == R.id.black){
            la.setBackgroundColor(Color.BLACK);
        }
        if (select_menu == R.id.gray){
            la.setBackgroundColor(Color.GRAY);
        }
        if (select_menu == R.id.yellow){
            la.setBackgroundColor(Color.YELLOW);
        }
        if (select_menu == R.id.reset){
            la.setBackgroundColor(Color.TRANSPARENT);
        }
        return true;
    }



//ContextMenu
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.contextmenu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int select_menu = item.getItemId();

        if (select_menu == R.id.opblue){
            la.setBackgroundColor(Color.BLUE);
        }
        if (select_menu == R.id.opreset){
            la.setBackgroundColor(Color.TRANSPARENT);
        }


       return true;
    }
}