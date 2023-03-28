package com.example.toshiba;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static  String TAG = MainActivity.class.getSimpleName();
    Button  loginButton;
    EditText nameEditText;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //inflating layout - baloon -- reads the xml and creates corresponding memory variables
        setContentView(R.layout.activity_main);
        Log.i(TAG,"i am in oncreate");
        loginButton = findViewById(R.id.btnLogin);
        nameEditText = findViewById(R.id.etName);
        loginButton.setOnClickListener(this);
    }

    public void showToast(View view) {
        Toast.makeText(this, "welcome to android at toshiba", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        String name = nameEditText.getText().toString();

        Log.i(TAG,"im in onclick --"+name);
        Toast.makeText(this, "welcome to android at toshiba", Toast.LENGTH_SHORT).show();
        Intent hIntent = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(hIntent);
    }
}