package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Signup2Activity extends AppCompatActivity {

    EditText username, password, email, confirm;
    Button btn;
    TextView tv;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup2);
        username = findViewById(R.id.editTextSignupLastName);
        password = findViewById(R.id.editTextSignupPassword);

        btn = findViewById(R.id.buttonSignup);
        tv = findViewById(R.id.textViewExistingUser);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Username = username.getText().toString();
                String Password = password.getText().toString();
                String Confirm = confirm.getText().toString();

                if (Username.length() == 0 || Password.length() == 0  || Confirm.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Please fill in all details", Toast.LENGTH_SHORT).show();
                } else {
                    if (Password.compareTo(Confirm) == 0) {
                        if (isValid(Password)) {
                            Toast.makeText(getApplicationContext(), "Password and Confirm Password didn't match", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(Signup2Activity.this, Signup4Activity.class));
                        } else {
                            Toast.makeText(getApplicationContext(), "Password must have 8 characters", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "Password and Confirm Password didn't match", Toast.LENGTH_SHORT).show();
                    }
                }
            }

        });

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Signup2Activity.this, LoginActivity.class));
            }
        });
    }
        public static boolean isValid(String P) {
            if (P.length() < 8) {
                return false;
            }
            return true;
        }



}