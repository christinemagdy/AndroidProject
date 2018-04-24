package com.example.christinm.triptravel;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(R.string.homepage);



        FloatingActionButton fab = findViewById(R.id.proFab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profileIntent = new Intent(MainActivity.this , UserProfile.class);
                startActivity(profileIntent);
            }
        });



        FloatingActionButton fab2 = findViewById(R.id.loginFab);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(MainActivity.this , LoginActivity.class);
                startActivity(loginIntent);
            }
        });



        FloatingActionButton fab3 = findViewById(R.id.registFab);
        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registIntent = new Intent(MainActivity.this , RegisterActivity.class);
                startActivity(registIntent);
            }
        });



    }


}
