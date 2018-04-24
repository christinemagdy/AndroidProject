package com.example.christinm.triptravel;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;

public class LoginActivity extends MainActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        setTitle(R.string.login);


        FloatingActionButton fab = findViewById(R.id.registFab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(LoginActivity.this , RegisterActivity.class);
                startActivity(intent2);
            }
        });


        FloatingActionButton fab2 = findViewById(R.id.homeFabe);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(LoginActivity.this , MainActivity.class);
                startActivity(intent2);
            }
        });
    }
}
