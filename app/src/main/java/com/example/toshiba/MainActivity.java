package com.example.toshiba;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button  loginButton;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity","i am in oncreate");
        loginButton = findViewById(R.id.btnLogin);

        loginButton.setOnClickListener(this);
    }

    public void showToast(View view) {
        Toast.makeText(this, "welcome to android at toshiba", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "welcome to android at toshiba", Toast.LENGTH_SHORT).show();
    }
}