package com.example.christinm.triptravel;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;

public class RegisterActivity extends MainActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);
        setTitle(R.string.signup);



        FloatingActionButton fab = findViewById(R.id.loginFab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(RegisterActivity.this , LoginActivity.class);
                startActivity(intent2);
            }
        });



        FloatingActionButton fab2 = findViewById(R.id.homeFab);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(RegisterActivity.this , MainActivity.class);
                startActivity(intent2);
            }
        });
    }
}
