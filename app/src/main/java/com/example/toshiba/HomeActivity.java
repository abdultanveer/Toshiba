package com.example.toshiba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    public static  String TAG = HomeActivity.class.getSimpleName();

    EditText contactEditText;
    TextView homeTv;
    @Override //memory is being allocated for the activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.i(TAG,"i am in oncreate");

        //get the intent which started this activity and get the extras from it
       /* String data = getIntent().getExtras().getString("nkey");
        //taking handle on the textview
        homeTv = findViewById(R.id.tvHome);
        homeTv.setText(data);*/

         contactEditText = findViewById(R.id.etContact);
        Button selectButton = findViewById(R.id.btnSelect);
        selectButton.setOnClickListener(this);

    }

    @Override //activity is visible for the user
    protected void onStart() {
        super.onStart();
        Log.e(TAG,"i am in onstart");
    }

    @Override //waking up  -- restore the state of the app
    protected void onResume() {
        super.onResume();
        Log.w(TAG,"i am in onresume");

    }

    @Override //sleep -- save the state of the app
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"i am in onpause");

    }


    @Override //hibernate in windows
    protected void onStop() {
        super.onStop();
        Log.v(TAG,"i am in onstop");

    }


    @Override //
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"i am in ondestroy");

    }

    @Override
    public void onClick(View view) {
        String contact = contactEditText.getText().toString();
        Intent cIntent = new Intent();
        cIntent.putExtra("ckey",contact);
        setResult(RESULT_OK,cIntent);
        int d = add(10,20);
        finish(); //ends the activity
        throw new NullPointerException("demo");
    }

    private int add(int i, int i1) {
        System.out.println("adding 2 nos");
        return i + i1;
    }
}