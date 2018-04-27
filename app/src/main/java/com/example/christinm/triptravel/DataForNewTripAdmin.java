package com.example.christinm.triptravel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DataForNewTripAdmin extends MainActivity {


    private DatabaseReference mDatabase;

    EditText tripname , From , To , TDate , Price;
    Button addBut;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_for_new_trip_admin);
        setTitle(R.string.addnewAdmin);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        tripname = (EditText) findViewById(R.id.tripNameEditText);
        From = (EditText) findViewById(R.id.fromEditText);
        To = (EditText) findViewById(R.id.toEditText);
        TDate = (EditText) findViewById(R.id.dateEditText);
        Price = (EditText) findViewById(R.id.priceEditText);

        addBut = (Button) findViewById(R.id.addNTrip);

    }

    public void addTrip(View view) {

        String new_trip_name , new_from , new_to , new_date , new_price;

        new_trip_name = tripname.getText().toString();
        new_from = From.getText().toString();
        new_to = To.getText().toString();
        new_date = TDate.getText().toString();
        new_price = Price.getText().toString();

        Trips trips= new Trips(new_trip_name , new_from , new_to , new_price , new_date );

        //Create key to be Random
        String key = mDatabase.child("trips").push().getKey();
        trips.setId(key);

        mDatabase.child("trips").child(key).setValue(trips);


        Intent homeIntent = new Intent(DataForNewTripAdmin.this , AdminProfile.class);
        startActivity(homeIntent);

    }
}
