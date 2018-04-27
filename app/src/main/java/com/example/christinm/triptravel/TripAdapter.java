package com.example.christinm.triptravel;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class TripAdapter extends ArrayAdapter<Trips> {

    FloatingActionButton edit , delete;
    private DatabaseReference mDatabase;

    public TripAdapter(@NonNull Context context, @NonNull List<Trips> trips) {
        super(context, 0, trips);
        mDatabase = FirebaseDatabase.getInstance().getReference().child("trips");

    }


    public View getView (int position  , View convertView , ViewGroup parent)
    {
        //Retrieve data for this Position
        final Trips trip = getItem(position);
        if(convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_trips_layout , parent , false);
        }

        TextView NameTxtView = (TextView) convertView.findViewById(R.id.nameTripView);
        TextView FromTxtView = (TextView) convertView.findViewById(R.id.fromTripView);
        TextView ToTxtView = (TextView) convertView.findViewById(R.id.toTripView);
        TextView DateTxtView = (TextView) convertView.findViewById(R.id.dateTripView);
        TextView PriceTxtView = (TextView) convertView.findViewById(R.id.priceTripView);

        NameTxtView.setText(trip.getTrip_name());
        FromTxtView.setText(trip.getFrom());
        ToTxtView.setText(trip.getTo());
        DateTxtView.setText(trip.getDate());
        PriceTxtView.setText(trip.getPrice());


        edit = (FloatingActionButton) convertView.findViewById(R.id.editTrip);
        delete =(FloatingActionButton) convertView.findViewById(R.id.deleteTrip);


        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent editIntent = new Intent(getContext(),EditTripAdmin.class);

                //3ashan aft7 l edit deh bl id bt3 l trip dah
                editIntent.putExtra("id" , trip.getId());
                editIntent.putExtra("NameTxtView" , trip.getTrip_name());
                editIntent.putExtra("FromTxtView" , trip.getFrom());
                editIntent.putExtra("ToTxtView" , trip.getTo());
                editIntent.putExtra("DateTxtView" , trip.getDate());
                editIntent.putExtra("PriceTxtView" , trip.getPrice());

                getContext().startActivity(editIntent);
            }
        });


        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDatabase.child(trip.getId()).removeValue();
            }
        });



        return convertView;
    }
}
