package com.example.christinm.triptravel;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends MainActivity {

    private FirebaseAuth mAuth;

    Button loginButton;
    EditText emailTxt , passTxt;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        setTitle(R.string.login);

        mAuth = FirebaseAuth.getInstance();

        loginButton = (Button) findViewById(R.id.loginBut);
        emailTxt = (EditText) findViewById(R.id.emailText);
        passTxt = (EditText) findViewById(R.id.passEditTxt);


        FloatingActionButton fab = findViewById(R.id.registFab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(LoginActivity.this , RegisterActivity.class);
                startActivity(intent2);
            }
        });
    }

    public void LoginBut(View view) {

        final String inputEmail = emailTxt.getText().toString();
        final String inputPass = passTxt.getText().toString();

        mAuth.signInWithEmailAndPassword(inputEmail, inputPass)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            if(inputEmail.equals("admina@gmail.com") && inputPass.equals("admin1"))
                            {
                                Intent profileIntent = new Intent(LoginActivity.this , AdminProfile.class);
                                startActivity(profileIntent);
                                finish();
                            }
                            else if(inputEmail != ("admina@gmail.com") && inputPass != ("admin1")){
                                Intent profileIntent = new Intent(LoginActivity.this , UserProfile.class);
                                startActivity(profileIntent);
                                finish();
                            }

                        } else {
                            // If sign in fails, display a message to the user.
                            Log.e("ERROR", "Failed Login", task.getException());

                        }
                    }
                });
    }
}
