package com.example.christinm.triptravel;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.TextView;

public class UserProfile extends MainActivity {

   // TextView txtfname , txtlname , txtphoneno , txtemail;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_profile);
        setTitle(R.string.profile);
/*
        FloatingActionButton fab2 = (FloatingActionButton) findViewById(R.id.homeFabe);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(UserProfile.this , HomePageUserActivity.class);
                startActivity(homeIntent);
            }
        });*/


    }

    public void manageTrips(View view) {
        Intent manageIntent = new Intent(UserProfile.this , ManageMyTrips.class);
        startActivity(manageIntent);
    }
}
