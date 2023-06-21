package com.example.whosthatpokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class index extends AppCompatActivity {

    private Spinner spinner;

    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);


        EditText player_name = (EditText) findViewById(R.id.player_name);

        if (player_name.getText().toString().isEmpty()) {
            Toast.makeText(index.this, "Please enter your username", Toast.LENGTH_SHORT).show();
        } else {
            Editable Username = player_name.getText();
            player_name.setText(Username);
            Toast.makeText(index.this, "Welcome " + Username, Toast.LENGTH_SHORT).show();

        }

        spinner = findViewById(R.id.spinner4);
        Button start_button_gameset = findViewById(R.id.start_button);

        List<String> difficulty = new ArrayList<>();
        difficulty.add(0, "Choose");
        difficulty.add("Easy");
        difficulty.add("Hard");


        ArrayAdapter<String> adapter;

        adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, difficulty);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getItemAtPosition(i).equals("Choose:")){

                }

                else
                {
                    if(adapterView.getItemAtPosition(i).equals("Easy"))
                    {
                        String item = adapterView.getItemAtPosition(i).toString();
                        Toast.makeText(adapterView.getContext(), "Selected: " + item, Toast.LENGTH_SHORT).show();

                        start_button_gameset.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent1 = new Intent(index.this, game_proper.class);
                            intent1.putExtra("level", 1);
                            startActivity(intent1);
                        }
                    });
                    }


                    if(adapterView.getItemAtPosition(i).equals("Hard"))
                    {
                        String item = adapterView.getItemAtPosition(i).toString();
                        Toast.makeText(adapterView.getContext(), "Selected: " + item, Toast.LENGTH_SHORT).show();

                        start_button_gameset.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent2 = new Intent(index.this, game_proper.class);
                            intent2.putExtra("level", 4);
                            startActivity(intent2);
                        }
                    });
                    }
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }


}