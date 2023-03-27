package com.example.toshiba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity","i am in oncreate");
    }

    public void showToast(View view) {
        Toast.makeText(this, "welcome to android at toshiba", Toast.LENGTH_SHORT).show();
    }
}