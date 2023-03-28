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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //get the intent which started this activity and get the extras from it
       /* String data = getIntent().getExtras().getString("nkey");
        Log.i(TAG,"i am in oncreate of "+TAG + data);
        //taking handle on the textview
        homeTv = findViewById(R.id.tvHome);
        homeTv.setText(data);*/

         contactEditText = findViewById(R.id.etContact);
        Button selectButton = findViewById(R.id.btnSelect);
        selectButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String contact = contactEditText.getText().toString();
        Intent cIntent = new Intent();
        cIntent.putExtra("ckey",contact);
        setResult(RESULT_OK,cIntent);
        finish(); //ends the activity
    }
}