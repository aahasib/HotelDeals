package com.example.completeproject;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class  MainActivity extends AppCompatActivity {

    private EditText signInEmail,signInPassword;
    public Button login,x;

    ProgressBar progressBar;

    FirebaseAuth fAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        signInEmail = findViewById(R.id.email_input_Id);
        signInPassword = findViewById(R.id.password_input_Id);
        progressBar=findViewById(R.id.pro);
        fAuth= FirebaseAuth.getInstance();
        login = (Button) findViewById(R.id.login_btn_Id);
        x = (Button)findViewById(R.id.create_btn_id);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String email = signInEmail.getText().toString().trim();
                String password =signInPassword.getText().toString().trim();

                if (TextUtils.isEmpty(email)) {

                    signInEmail.setError("Email is Required");
                    return;
                }

                if (TextUtils.isEmpty(password)) {

                    signInPassword.setError("password is Required");
                    return;
                }

                if (password.length() < 6) {
                    signInPassword.setError("password must be >=6 charcter");
                    return;
                }
                fAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override

                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(MainActivity.this," login successful",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                            startActivity(intent);

                        }
                        else
                        {
                            Toast.makeText(MainActivity.this," Login not successful try again or Create a new account",Toast.LENGTH_SHORT).show();

                        }

                    }
                });


            }
        });
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });





    }
}