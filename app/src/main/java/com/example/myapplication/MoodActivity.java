package com.example.myapplication;

import static android.content.ContentValues.TAG;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class MoodActivity extends AppCompatActivity {
    private CalendarView cal;
    private Button buttonHappy, buttonAnxious, buttonSad, buttonUpset;
    private Map<String, String> dateMoodMap;
    private String selectedDate;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mood);
        cal = (CalendarView) findViewById(R.id.calendarView);
        buttonHappy = findViewById(R.id.button_happy);
        buttonAnxious = findViewById(R.id.button_anxious);
        buttonSad = findViewById(R.id.button_sad);
        buttonUpset = findViewById(R.id.button_upset);


        dateMoodMap = new HashMap<>();
        cal.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int i, int i1, int i2) {
                String selectedDate = i2 + "/" + (i1 + 1) + "/" + i;
//            Log.d(TAG, "onSelectedDayChange: dd/mm/yyyy:" + date);

//                Intent intent = new Intent(MoodActivity.this,Mood2Activity.class);
//                intent.putExtra("date", date);
//                startActivity(intent);
            }
        });

        buttonHappy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MoodActivity.this,chatBox.class);
//                intent.putExtra("imageResource", R.drawable.happy);
//                startActivity(intent);
            }
        });
        buttonAnxious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MoodActivity.this,chatBox.class);
//                intent.putExtra("imageResource", R.drawable.sad);
//                startActivity(intent);
            }


        });

        buttonSad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MoodActivity.this,chatBox.class);
//                intent.putExtra("imageResource", R.drawable.neutral);
//                startActivity(intent);

            }
        });

        buttonUpset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MoodActivity.this,chatBox.class);
//                intent.putExtra("imageResource", R.drawable.angry);
//                startActivity(intent);

            }
        });

    }
}


