package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Dashboard1Activity extends AppCompatActivity {
    ImageView imageView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dashboard1);
        CardView profile = findViewById(R.id.dashboard1profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dashboard1Activity.this, ProfileActivity.class));
            }
        });
        CardView mood = findViewById(R.id.dashboard1MoodTracker);
         mood.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View view) {
              startActivity(new Intent(Dashboard1Activity.this, MoodActivity.class));
              }
    });


//        CardView chat= findViewById(R.id.dashboard1chat);
//        chat.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(Dashboard1Activity.this, chatBoxActivity.class));
//            }
//        });

        imageView = findViewById(R.id.dashboard1avatar);
        Intent intent = getIntent();
        int imageResource = intent.getIntExtra("imageResource" ,- 1);

        if (imageResource != -1) {
            imageView.setImageResource(imageResource);
        }


    }
}