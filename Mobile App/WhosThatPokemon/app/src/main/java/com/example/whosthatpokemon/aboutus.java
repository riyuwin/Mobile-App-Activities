package com.example.whosthatpokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class aboutus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
    }


    public void launchSubmit(View view) {
        EditText editText = (EditText) findViewById(R.id.player_name);
        if (editText.getText().toString().isEmpty()){
            Toast.makeText(aboutus.this, "Please input something", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(aboutus.this, "Thank you for your suggestion.", Toast.LENGTH_SHORT).show();

        }
    }


    public void Rate(View view) {
        EditText editText = (EditText) findViewById(R.id.editTextNumberSigned);
        if (editText.getText().toString().isEmpty()) {
            Toast.makeText(aboutus.this, "Please input something", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(aboutus.this, "Thank you for rating us.", Toast.LENGTH_SHORT).show();

        }
    }


}