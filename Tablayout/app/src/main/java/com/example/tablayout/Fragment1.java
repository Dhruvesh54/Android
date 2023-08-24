package com.example.tablayout;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.zip.Inflater;

public class Fragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_1, container, false);

    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater m) {


        m.inflate(R.menu.chats,menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int select_item = item.getItemId();

        if (select_item == R.id.menu1){
            Toast.makeText(getContext(), "menu1", Toast.LENGTH_SHORT).show();
            item.setChecked(true);
        } else if (select_item == R.id.menu2) {
            Toast.makeText(getContext(), "menu2", Toast.LENGTH_SHORT).show();
            item.setChecked(true);

        }
        return true;
    }
}