package com.example.toshiba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    public static  String TAG = HomeActivity.class.getSimpleName();
    TextView tvHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //get the intent which started this activity and get the extras from it
       String data = getIntent().getExtras().getString("nkey");
        Log.i(TAG,"i am in oncreate of "+TAG + data);
        //taking handle on the textview
        tvHome = findViewById(R.id.tvHome);
        tvHome.setText(data);

    }
}