package com.example.christinm.triptravel;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.TextView;

public class ManageMyTrips extends MainActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manage_trips_user);
        setTitle(R.string.editTrip);


        TextView pressView = (TextView)findViewById(R.id.row_item);
        //register if for context
        registerForContextMenu(pressView);




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.proFab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profileIntent = new Intent(ManageMyTrips.this , UserProfile.class);
                startActivity(profileIntent);
            }
        });


        FloatingActionButton fab2 = (FloatingActionButton) findViewById(R.id.homeFabe);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(ManageMyTrips.this , MainActivity.class);
                startActivity(homeIntent);
            }
        });


    }


    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.trips_menu, menu);
    }
}