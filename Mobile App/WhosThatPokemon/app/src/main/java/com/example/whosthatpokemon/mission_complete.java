package com.example.whosthatpokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class mission_complete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission_complete);



        EditText feedback = (EditText) findViewById(R.id.feedback);

        if (feedback.getText().toString().isEmpty()) {
            Toast.makeText(mission_complete.this, "Please enter your response.", Toast.LENGTH_SHORT).show();
        } else {
            Editable Username = feedback.getText();
            feedback.setText(Username);
            Toast.makeText(mission_complete.this, "Thank you for your response.", Toast.LENGTH_SHORT).show();

        }
    }


    public void LaunchBacktoHome(View view) {

        switch (view.getId()) {
            case (R.id.home_btn):
                Intent intent = new Intent(this, index.class);
                startActivity(intent);
                break;
        }
    }
}