package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Signup5Activity extends AppCompatActivity {

    private CheckBox cbMentalhealth;
    private CheckBox cbGrief;
    private CheckBox cbCareer;
    private CheckBox cbEducation;
    private Button btnSave;
    private RadioGroup rgProblemTypes;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup5);
        cbMentalhealth = findViewById(R.id.cbMentalhealth);
        cbGrief = findViewById(R.id.cbGrief);
        cbCareer = findViewById(R.id.cbCareer);
        cbEducation = findViewById(R.id.cbEducation);
        btnSave = findViewById(R.id.btnSave);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveProblemTypes();
                navigateToNextActivity();
            }
        });
    }

    private void saveProblemTypes() {
        List<String> selectedProblemTypes = getSelectedProblemTypes();

        //database code from zayd may go here
        if (!selectedProblemTypes.isEmpty()) {
            String message = "Selected Problem Types: " + selectedProblemTypes.toString();
            Toast.makeText(Signup5Activity.this, message, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(Signup5Activity.this, "Please select at least one problem type.", Toast.LENGTH_SHORT).show();
        }
    }

    private List<String> getSelectedProblemTypes() {
        List<String> selectedProblemTypes = new ArrayList<>();

        if (cbMentalhealth.isChecked()) {
            selectedProblemTypes.add(cbMentalhealth.getText().toString());
        }
        if (cbGrief.isChecked()) {
            selectedProblemTypes.add(cbGrief.getText().toString());
        }
        if (cbCareer.isChecked()) {
            selectedProblemTypes.add(cbCareer.getText().toString());
        }
        if (cbEducation.isChecked()) {
            selectedProblemTypes.add(cbEducation.getText().toString());
        }

        return selectedProblemTypes;
    }

    private void navigateToNextActivity() {
        Intent intent = new Intent(Signup5Activity.this, LoginActivity.class);
        startActivity(intent);
    }
}
