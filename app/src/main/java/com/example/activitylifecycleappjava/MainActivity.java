package com.example.activitylifecycleappjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String AC = "Main Activity";
    private static final int TL = Toast.LENGTH_LONG;
    private String message = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message = " onCreate() called";
        Toast.makeText(this, AC + message, TL).show();

        Button startBtn = findViewById(R.id.startbtn);
        Button stopBtn = findViewById(R.id.stopbtn);

        startBtn.setOnClickListener(this);
        stopBtn.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        message = " onStart() called";
        Toast.makeText(this, AC + message, TL).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        message = " onStop() called";
        Toast.makeText(this, AC + message, TL).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        message = " onDestroy() called";
        Toast.makeText(this, AC + message, TL).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        message = " onPause() called";
        Toast.makeText(this, AC + message, TL).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        message = " onRestart() called";
        Toast.makeText(this, AC + message, TL).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        message = " onResume() called";
        Toast.makeText(this, AC + message, TL).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.startbtn:
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                break;

            case R.id.stopbtn:
                message = AC + " Calling finish";
                Toast.makeText(this, message, TL).show();
                finish();
        }
    }
}
