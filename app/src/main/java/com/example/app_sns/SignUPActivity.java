package com.example.app_sns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignUPActivity extends AppCompatActivity {

    private EditText mEmail, mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_upactivity);

        mEmail = findViewById(R.id.signEmail);
        mPassword = findViewById(R.id.signPassword);

        findViewById(R.id.signUp_BTN).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}