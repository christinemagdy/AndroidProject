package com.example.christinm.triptravel;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;

public class NewTripActivity extends MainActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_trip_activity_user);
        setTitle(R.string.newTrip);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.proFab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profileIntent = new Intent(NewTripActivity.this , UserProfile.class);
                startActivity(profileIntent);
            }
        });


        FloatingActionButton fab2 = (FloatingActionButton) findViewById(R.id.homeFabe);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(NewTripActivity.this , HomePageUserActivity.class);
                startActivity(homeIntent);
            }
        });
    }

}
