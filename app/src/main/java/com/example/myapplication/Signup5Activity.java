package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Signup5Activity extends AppCompatActivity {
    private RadioGroup rgProblemTypes;
    private Button btnSave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup5);
        rgProblemTypes = findViewById(R.id.rgProblemTypes);
        btnSave = findViewById(R.id.btnSave2);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                saveProblemType();
                navigateToNextActivity();
            }
        });

    }
    private void saveProblemType() {
        String problemType = getSelectedProblemType();

//        code that needs to save problem types into the database that will be used to match user with counselor
        //example of code
//        UserDatabase userDatabase = UserDatabase.getInstance(this);
//        userDatabase.saveProblemType(problemType);
//        Toast.makeText(ProblemTypeActivity.this, "Problem type saved successfully", Toast.LENGTH_SHORT).show();
    }
    private String getSelectedProblemType() {
        int selectedId = rgProblemTypes.getCheckedRadioButtonId();
        RadioButton selectedRadioButton = findViewById(selectedId);
        if (selectedRadioButton != null) {
            return selectedRadioButton.getText().toString();
        }
        return "";
    }
    private void navigateToNextActivity() {

        Intent intent = new Intent(Signup5Activity.this, LoginActivity.class);
        startActivity(intent);
    }


}