package com.example.christinm.triptravel;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;

public class DeleteTripAdmin extends MainActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delete_trip_admin);
        setTitle(R.string.deletetripadmin);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.backFab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent(DeleteTripAdmin.this , AdminProfileActivity.class);
                startActivity(backIntent);
            }
        });


    }
}
