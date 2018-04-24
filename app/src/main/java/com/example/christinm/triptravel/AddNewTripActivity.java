package com.example.christinm.triptravel;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;

public class AddNewTripActivity extends MainActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_profile);
        setTitle(R.string.addnew);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.backFab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent(AddNewTripActivity.this , AdminProfileActivity.class);
                startActivity(backIntent);
            }
        });

    }
}

