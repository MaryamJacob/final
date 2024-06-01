package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        new CountDownTimer(5000,1000){
            @Override
            public void onTick(long millisUntilFinished){}
            @Override
            public void onFinish(){
                startActivity(new Intent(MainActivity2.this, Login1Activity.class));
            }
        }.start();


    }
}