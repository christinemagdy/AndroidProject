package com.example.christinm.triptravel;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;

public class ManageMyTrips extends MainActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manage_trips);
        setTitle(R.string.editTrip);


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
}