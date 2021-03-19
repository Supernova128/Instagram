package com.example.instagram;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class SignupActivity extends AppCompatActivity {
    private EditText etUsername;
    private EditText etPassword;
    private Button btnSignup;
    private Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        etUsername = findViewById(R.id.etUsername2);
        etPassword = findViewById(R.id.etPassword2);
        btnSignup = findViewById(R.id.btnSignup);
        btnBack = findViewById(R.id.btnBack);
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                signupUser(username,password);
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLoginActivity();
            }
        });
    }
    private void goLoginActivity(){
        Intent i = new Intent(this,LoginActivity.class);
        startActivity(i);
    }
    private void signupUser(String username, String password) {
        ParseUser user = new ParseUser();
        user.setUsername(username);
        user.setPassword(password);
        user.signUpInBackground(new SignUpCallback() {

            @Override
            public void done(ParseException e) {
                if ( e == null){
                    goMainActivity();
                } else {
                    Log.e("SignupActivity","Fail",e);
                    return;
                }
            }
        });
    }
    private void goMainActivity(){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}