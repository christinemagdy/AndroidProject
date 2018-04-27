package com.example.christinm.triptravel;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends MainActivity {

    private FirebaseAuth mAuth;

    EditText email , password , confirmPass;
    Button submit ;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);
        setTitle(R.string.signup);

        mAuth = FirebaseAuth.getInstance();

        email = (EditText) findViewById(R.id.emailText);
        password = (EditText) findViewById(R.id.passwordText);
        confirmPass = (EditText) findViewById(R.id.confpasswordText);



        FloatingActionButton fab = findViewById(R.id.loginFab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(RegisterActivity.this , LoginActivity.class);
                startActivity(loginIntent);
            }
        });

    }


    public void SubmitBut(View view) {

        String inputEmail = email.getText().toString();
        String inputPassword = password.getText().toString();
        String inputConfPass = confirmPass.getText().toString();

        if(inputEmail.isEmpty() || inputEmail.equals(" "))
        {
            email.setError("Fill Your Email Please !");
            return;
        }
        if(inputPassword.isEmpty() || inputPassword.equals(" "))
        {
            password.setError("Fill your Password Please !");
            return;
        }
        if(inputConfPass.isEmpty() || inputConfPass.equals(" "))
        {
            confirmPass.setError("Fill your Confirm Password Please !");
            return;
        }
        if(!inputConfPass.equals(inputPassword))
        {
            confirmPass.setError("Password not matched !");
            return;
        }

        mAuth.createUserWithEmailAndPassword(inputEmail, inputPassword)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.e("Trip" , "Success");
                            Toast.makeText(RegisterActivity.this , "Success" , Toast.LENGTH_LONG).show();

                        } else {
                            // If sign in fails, display a message to the user.
                            Log.e("ERROR" , task.getException().toString());
                            Toast.makeText(RegisterActivity.this , "Failed" , Toast.LENGTH_LONG).show();
                        }


                    }
                });

    }
}
