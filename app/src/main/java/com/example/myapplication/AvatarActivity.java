package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
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
    ImageView avat1;
    ImageView avat2;
    ImageView avat3;



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
                Intent intent = new Intent(AvatarActivity.this,ProfileActivity.class);
                Intent intent2 = new Intent(AvatarActivity.this,Dashboard1Activity.class);      ;
                intent.putExtra("imageResource", R.drawable.panda);
                startActivity(intent);
            }
        });

        avat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AvatarActivity.this,ProfileActivity.class);
                Intent intent2 = new Intent(AvatarActivity.this,Dashboard1Activity.class);
                intent.putExtra("imageResource", R.drawable.bear);
                startActivity(intent);
            }
        });
        avat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AvatarActivity.this,ProfileActivity.class);
                Intent intent2 = new Intent(AvatarActivity.this,Dashboard1Activity.class);
                intent.putExtra("imageResource", R.drawable.brownb);
                startActivity(intent);
            }
        });



    }
}