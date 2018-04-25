package com.example.christinm.triptravel;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

public class AdminProfileActivity extends MainActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_profile);
        setTitle(R.string.adminProfile);


        TextView pressView = (TextView)findViewById(R.id.row_item);
        //register if for context
        registerForContextMenu(pressView);


        FloatingActionButton fab = findViewById(R.id.addnewTripAdmin);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(AdminProfileActivity.this ,AddNewTripActivity.class);
                startActivity(loginIntent);
            }
        });
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.trips_menu, menu);
    }



    public void addNewTrip(View view) {
        //Write the add Trip Code
    }

    public void deleteTrip(View view) {
        //Write the Delete Trip Code
    }


}