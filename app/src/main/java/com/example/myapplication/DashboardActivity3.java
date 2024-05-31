package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.GridLayout;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


public class DashboardActivity3 extends AppCompatActivity {
    Button btn;
    CalendarView cal;

    GridLayout gridLayout = findViewById(R.id.gridLayout);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        btn = findViewById(R.id.buttonCounselations);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity3.this, ProfileActivity.class));
            }


        });
    }
}