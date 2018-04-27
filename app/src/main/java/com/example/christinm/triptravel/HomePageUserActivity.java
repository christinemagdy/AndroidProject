package com.example.christinm.triptravel;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class HomePageUserActivity extends MainActivity {

    ListView tripsList;
    ArrayList<Trips> trip;
    private DatabaseReference mDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        setTitle(R.string.homepage);

        tripsList = (ListView) findViewById(R.id.tripLists);

        mDatabase = FirebaseDatabase.getInstance().getReference().child("trips");

        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                //awl ma yad5ol yasfr l list w b3den yabd2 yadef
                trip = new ArrayList<Trips>();
                for (DataSnapshot postSnapshot: dataSnapshot.getChildren()) {
                    //a7wal l 7aga 2ly rag3ly
                    Trips trips = postSnapshot.getValue(Trips.class);
                    trip.add(trips);

                    //adapter
                    TripAdapter tripAdapter = new TripAdapter(HomePageUserActivity.this , trip);

                    //connect list with adapter
                    tripsList.setAdapter(tripAdapter);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }


}
