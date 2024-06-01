package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AvatarActivity extends AppCompatActivity {
    FloatingActionButton avat1;
    FloatingActionButton avat2;
    FloatingActionButton avat3;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_avatar);

        avat1 = findViewById(R.id.avatar1);
        avat2 = findViewById(R.id.avatar2);
        avat3= findViewById(R.id.avatar3);

        avat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = (ImageView) findViewById(R.id.avatar);
                imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.bear));
            }
        });

        avat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = (ImageView) findViewById(R.id.avatar);
                imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.brownb));
            }
        });
        avat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = (ImageView) findViewById(R.id.avatar);
                imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.panda));
            }
        });



    }
}