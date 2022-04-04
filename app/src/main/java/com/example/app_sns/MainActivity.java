package com.example.app_sns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mEmail, mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEmail = findViewById(R.id.Login_Email);
        mPassword = findViewById(R.id.Login_Password);

        findViewById(R.id.Login_BTN).setOnClickListener(this);
        findViewById(R.id.Login_Signup).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Login_Signup:

                break;
            case R.id.Login_BTN:

                break;
        }

    }
}