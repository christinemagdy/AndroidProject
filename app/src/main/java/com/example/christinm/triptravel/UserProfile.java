package com.example.christinm.triptravel;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;

public class UserProfile extends MainActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_profile);
        setTitle(R.string.profile);



        FloatingActionButton fab2 = (FloatingActionButton) findViewById(R.id.homeFabe);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(UserProfile.this , MainActivity.class);
                startActivity(homeIntent);
            }
        });

    }

    public void editProfile(View view) {

        Intent registerIntent = new Intent(UserProfile.this , RegisterActivity.class);
        startActivity(registerIntent);
    }

    public void manageTrips(View view) {
        Intent manageIntent = new Intent(UserProfile.this , ManageMyTrips.class);
        startActivity(manageIntent);
    }
}
