package com.example.christinm.triptravel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class EditTripAdmin extends AppCompatActivity {

    private DatabaseReference mDatabase;

    String trip_name_value, trip_from_value, trip_to_value , trip_date_value, trip_price_value , id;
    EditText trip_name, trip_from, trip_to , trip_date, trip_price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_trip_admin);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        trip_name_value = getIntent().getExtras().getString("NameTxtView");
        trip_from_value = getIntent().getExtras().getString("FromTxtView");
        trip_to_value = getIntent().getExtras().getString("ToTxtView");
        trip_date_value = getIntent().getExtras().getString("DateTxtView");
        trip_price_value = getIntent().getExtras().getString("PriceTxtView");
        id = getIntent().getExtras().getString("id");


        trip_name = (EditText) findViewById(R.id.updateTripNameEditText);
        trip_from = (EditText) findViewById(R.id.updateFromEditText);
        trip_to = (EditText) findViewById(R.id.updateToEditText);
        trip_date = (EditText) findViewById(R.id.updateDateEditText);
        trip_price = (EditText) findViewById(R.id.updatePriceEditText);


        //a7ot b2a fe l makan bt3 l text l text 2ly gayly
        trip_name.setText(trip_name_value);
        trip_from.setText(trip_from_value);
        trip_to.setText(trip_to_value);
        trip_date.setText(trip_date_value);
        trip_price.setText(trip_price_value);


    }

    public void updateTrip(View view) {

        String tname, tfrom, tto , tdate, tprice;
        tname = trip_name.getText().toString();
        tfrom = trip_from.getText().toString();
        tto = trip_to.getText().toString();
        tdate = trip_date.getText().toString();
        tprice = trip_price.getText().toString();

        Trips trips  = new Trips(tname, tfrom, tto , tdate, tprice);
        trips.setId(id);
        mDatabase.child("trips").child(id).setValue(trips);

        onBackPressed();
    }
}
