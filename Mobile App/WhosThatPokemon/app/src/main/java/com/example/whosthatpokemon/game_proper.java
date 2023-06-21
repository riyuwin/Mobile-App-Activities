package com.example.whosthatpokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import android.media.MediaPlayer;

import org.w3c.dom.Text;

public class game_proper extends AppCompatActivity {


    public String playerAnswer;
    public String CorrectAnswer;

    public int Points;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_proper);

        MediaPlayer chickensound;
        MediaPlayer pandasound;
        MediaPlayer lionsound;
        MediaPlayer dogsound;
        MediaPlayer gorillasound;
        MediaPlayer pigsound;
        MediaPlayer catsound;

        Button getValue;
        Button Nextbtn = findViewById(R.id.next_btn);

        ImageView imageViewPlaceHolder = findViewById(R.id.imageplaceholder);
        TextView level_label = findViewById(R.id.level_label);
        RadioButton RadioButton1 = findViewById(R.id.radiobtn1);
        RadioButton RadioButton2 = findViewById(R.id.radiobtn2);
        RadioButton RadioButton3 = findViewById(R.id.radiobtn3);
        RadioButton RadioButton4 = findViewById(R.id.radiobtn4);
        RadioGroup RadioBtnGroup = findViewById(R.id.radioGroup);

        TextView remarks = findViewById(R.id.remarks);
        TextView correct_remarks = findViewById(R.id.correct_remarks);


        int point = 0;

        final RadioButton[] radioButton = new RadioButton[1];

        Intent intent = getIntent();

        int level = intent.getIntExtra("level", 0);

        getValue = findViewById(R.id.submit_btn);

        chickensound = MediaPlayer.create(game_proper.this, R.raw.chicken_sound);

        lionsound = MediaPlayer.create(game_proper.this, R.raw.lion_sound);
        pandasound = MediaPlayer.create(game_proper.this, R.raw.panda_sound);
        dogsound = MediaPlayer.create(game_proper.this, R.raw.dog_sound);
        gorillasound = MediaPlayer.create(game_proper.this, R.raw.gorilla_sound);
        pigsound = MediaPlayer.create(game_proper.this, R.raw.pigsound);
        catsound = MediaPlayer.create(game_proper.this, R.raw.catsound);

        Nextbtn.setVisibility(View.INVISIBLE);

        if (level == 1){
            imageViewPlaceHolder.setImageResource(R.drawable.unknown_lion_modified);
            RadioButton1.setText("Horse");
            RadioButton2.setText("Zebra");
            RadioButton3.setText("Tiger");
            RadioButton4.setText("Turtle");
            level_label.setText("Easy 1");
            CorrectAnswer = "Tiger";


            //Once the button submitted
            getValue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int selectedId = RadioBtnGroup.getCheckedRadioButtonId();
                    radioButton[0] = findViewById(selectedId);

                    playerAnswer = radioButton[0].getText().toString();

                    if (playerAnswer == "Tiger") {
                        Toast.makeText(getApplicationContext(), "You've got a correct answer.", Toast.LENGTH_SHORT).show();

                        imageViewPlaceHolder.setImageResource(R.drawable.lion_modified);
                        getValue.setVisibility(View.INVISIBLE);

                        remarks.setText("CORRECT");

                        Nextbtn.setVisibility(View.VISIBLE);

                    } else {
                        Toast.makeText(getApplicationContext(), "Wrong answer.", Toast.LENGTH_SHORT).show();
                        getValue.setVisibility(View.INVISIBLE);

                        imageViewPlaceHolder.setImageResource(R.drawable.lion_modified);

                        correct_remarks.setText("Correct answer: Tiger");

                        Nextbtn.setVisibility(View.VISIBLE);

                    }

                    lionsound.start();
                    Nextbtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            lionsound.pause();

                            Intent intent1 = new Intent(game_proper.this, game_proper.class);
                            intent1.putExtra("level", 2);
                            startActivity(intent1);

                        }
                    });


                }

            });

            } else if (level == 2){
            imageViewPlaceHolder.setImageResource(R.drawable.unknown_dog_modified);
            RadioButton1.setText("Cat");
            RadioButton2.setText("Pig");
            RadioButton3.setText("Dog");
            RadioButton4.setText("Eagle");
            level_label.setText("Easy 2");
            CorrectAnswer = "Dog";



            //Once the button submitted
            getValue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int selectedId = RadioBtnGroup.getCheckedRadioButtonId();
                    radioButton[0] = findViewById(selectedId);

                    playerAnswer = radioButton[0].getText().toString();

                    if (playerAnswer == "Dog") {
                        Toast.makeText(getApplicationContext(), "You've got a correct answer.", Toast.LENGTH_SHORT).show();

                        imageViewPlaceHolder.setImageResource(R.drawable.dog_modified);
                        getValue.setVisibility(View.INVISIBLE);

                        remarks.setText("CORRECT");

                        Nextbtn.setVisibility(View.VISIBLE);

                    } else {
                        Toast.makeText(getApplicationContext(), "Wrong answer.", Toast.LENGTH_SHORT).show();
                        getValue.setVisibility(View.INVISIBLE);

                        imageViewPlaceHolder.setImageResource(R.drawable.dog_modified);

                        correct_remarks.setText("Correct answer: Dog");

                        Nextbtn.setVisibility(View.VISIBLE);

                    }

                    dogsound.start();

                    Nextbtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            dogsound.pause();
                            Intent intent1 = new Intent(game_proper.this, game_proper.class);
                            intent1.putExtra("level", 3);
                            startActivity(intent1);

                        }
                    });

                }

            });
        } else if (level == 3){
            imageViewPlaceHolder.setImageResource(R.drawable.unknown_panda_modified);
            RadioButton1.setText("Panda");
            RadioButton2.setText("Shark");
            RadioButton3.setText("Dog");
            RadioButton4.setText("Frog");
            level_label.setText("Easy 3");
            CorrectAnswer = "Panda";

            //Once the button submitted
            getValue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int selectedId = RadioBtnGroup.getCheckedRadioButtonId();
                    radioButton[0] = findViewById(selectedId);

                    playerAnswer = radioButton[0].getText().toString();

                    if (playerAnswer == "Panda") {
                        Toast.makeText(getApplicationContext(), "You've got a correct answer.", Toast.LENGTH_SHORT).show();

                        imageViewPlaceHolder.setImageResource(R.drawable.panda_modified);
                        getValue.setVisibility(View.INVISIBLE);

                        remarks.setText("CORRECT");

                        Nextbtn.setVisibility(View.VISIBLE);

                    } else {
                        Toast.makeText(getApplicationContext(), "Wrong answer.", Toast.LENGTH_SHORT).show();
                        getValue.setVisibility(View.INVISIBLE);

                        imageViewPlaceHolder.setImageResource(R.drawable.panda_modified);

                        correct_remarks.setText("Correct answer: Panda");

                        Nextbtn.setVisibility(View.VISIBLE);

                    }

                    pandasound.start();

                    Nextbtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            pandasound.pause();
                            Intent intent1 = new Intent(game_proper.this, mission_complete.class);
                            startActivity(intent1);

                        }
                    });

                }

            });
        } else if (level == 4){
            imageViewPlaceHolder.setImageResource(R.drawable.unknown_manok);
            RadioButton1.setText("Monkey");
            RadioButton2.setText("Horse");
            RadioButton3.setText("Rooster");
            RadioButton4.setText("Gorilla");
            level_label.setText("Hard 1");
            CorrectAnswer = "Rooster";


            //Once the button submitted
            getValue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int selectedId = RadioBtnGroup.getCheckedRadioButtonId();
                    radioButton[0] = findViewById(selectedId);

                    playerAnswer = radioButton[0].getText().toString();

                    if (playerAnswer == "Rooster") {
                        Toast.makeText(getApplicationContext(), "You've got a correct answer.", Toast.LENGTH_SHORT).show();

                        imageViewPlaceHolder.setImageResource(R.drawable.manok);
                        getValue.setVisibility(View.INVISIBLE);

                        remarks.setText("CORRECT");

                        Nextbtn.setVisibility(View.VISIBLE);

                    } else {
                        Toast.makeText(getApplicationContext(), "Wrong answer.", Toast.LENGTH_SHORT).show();
                        getValue.setVisibility(View.INVISIBLE);

                        imageViewPlaceHolder.setImageResource(R.drawable.manok);

                        correct_remarks.setText("Correct answer: Rooster");

                        Nextbtn.setVisibility(View.VISIBLE);

                    }

                    chickensound.start();
                    Nextbtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            chickensound.pause();
                            Intent intent1 = new Intent(game_proper.this, game_proper.class);
                            intent1.putExtra("level", 5);
                            startActivity(intent1);

                        }
                    });

                }

            });} else if (level == 5){
            imageViewPlaceHolder.setImageResource(R.drawable.unknow_gori_modified);
            RadioButton1.setText("Spider");
            RadioButton2.setText("Goat");
            RadioButton3.setText("Rooster");
            RadioButton4.setText("Gorilla");
            level_label.setText("Hard 2");
            CorrectAnswer = "Gorilla";


            //Once the button submitted
            getValue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int selectedId = RadioBtnGroup.getCheckedRadioButtonId();
                    radioButton[0] = findViewById(selectedId);

                    playerAnswer = radioButton[0].getText().toString();

                    if (playerAnswer == "Gorilla") {
                        Toast.makeText(getApplicationContext(), "You've got a correct answer.", Toast.LENGTH_SHORT).show();

                        imageViewPlaceHolder.setImageResource(R.drawable.gori_modified);
                        getValue.setVisibility(View.INVISIBLE);

                        remarks.setText("CORRECT");

                        Nextbtn.setVisibility(View.VISIBLE);

                    } else {
                        Toast.makeText(getApplicationContext(), "Wrong answer.", Toast.LENGTH_SHORT).show();
                        getValue.setVisibility(View.INVISIBLE);

                        imageViewPlaceHolder.setImageResource(R.drawable.gori_modified);

                        correct_remarks.setText("Correct answer: Gorilla");

                        Nextbtn.setVisibility(View.VISIBLE);

                    }
                    gorillasound.setLooping(false);

                    gorillasound.start();

                    Nextbtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            gorillasound.pause();
                            Intent intent1 = new Intent(game_proper.this, game_proper.class);
                            intent1.putExtra("level", 6);
                            startActivity(intent1);

                        }
                    });
                }

            });} else if (level == 6){
            imageViewPlaceHolder.setImageResource(R.drawable.unknown_pig);
            RadioButton1.setText("Chicken");
            RadioButton2.setText("Pig");
            RadioButton3.setText("Lizard");
            RadioButton4.setText("Zebra");
            level_label.setText("Hard 3");
            CorrectAnswer = "Pig";


            //Once the button submitted
            getValue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int selectedId = RadioBtnGroup.getCheckedRadioButtonId();
                    radioButton[0] = findViewById(selectedId);

                    playerAnswer = radioButton[0].getText().toString();

                    if (playerAnswer == "Pig") {
                        Toast.makeText(getApplicationContext(), "You've got a correct answer.", Toast.LENGTH_SHORT).show();

                        imageViewPlaceHolder.setImageResource(R.drawable.pig);
                        getValue.setVisibility(View.INVISIBLE);

                        remarks.setText("CORRECT");

                        Nextbtn.setVisibility(View.VISIBLE);

                    } else {
                        Toast.makeText(getApplicationContext(), "Wrong answer.", Toast.LENGTH_SHORT).show();
                        getValue.setVisibility(View.INVISIBLE);

                        imageViewPlaceHolder.setImageResource(R.drawable.pig);

                        correct_remarks.setText("Correct answer: Pig");

                        Nextbtn.setVisibility(View.VISIBLE);

                    }


                    pigsound.setLooping(false);
                    pigsound.start();
                    Nextbtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            pigsound.pause();
                            Intent intent1 = new Intent(game_proper.this, game_proper.class);
                            intent1.putExtra("level", 7);
                            startActivity(intent1);

                        }
                    });


                }

            });} else if (level == 7){
            imageViewPlaceHolder.setImageResource(R.drawable.unknown_lion2);
            RadioButton1.setText("Cat");
            RadioButton2.setText("Lion");
            RadioButton3.setText("Dog");
            RadioButton4.setText("Ostrich");
            level_label.setText("Hard 4");
            CorrectAnswer = "Lion";

            //Once the button submitted
            getValue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int selectedId = RadioBtnGroup.getCheckedRadioButtonId();
                    radioButton[0] = findViewById(selectedId);

                    playerAnswer = radioButton[0].getText().toString();

                    if (playerAnswer == "Lion") {
                        Toast.makeText(getApplicationContext(), "You've got a correct answer.", Toast.LENGTH_SHORT).show();

                        imageViewPlaceHolder.setImageResource(R.drawable.lion2);
                        getValue.setVisibility(View.INVISIBLE);

                        remarks.setText("CORRECT");

                        Nextbtn.setVisibility(View.VISIBLE);

                    } else {
                        Toast.makeText(getApplicationContext(), "Wrong answer.", Toast.LENGTH_SHORT).show();
                        getValue.setVisibility(View.INVISIBLE);

                        imageViewPlaceHolder.setImageResource(R.drawable.lion2);

                        correct_remarks.setText("Correct answer: Lion");

                        Nextbtn.setVisibility(View.VISIBLE);

                    }
                    lionsound.setLooping(false);
                    lionsound.start();


                    Nextbtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            lionsound.pause();
                            Intent intent1 = new Intent(game_proper.this, game_proper.class);
                            intent1.putExtra("level", 8);
                            startActivity(intent1);

                        }
                    });

                }

            });} else if (level == 8){
            imageViewPlaceHolder.setImageResource(R.drawable.unknown_cat);
            RadioButton1.setText("Cat");
            RadioButton2.setText("Snake");
            RadioButton3.setText("Eagle");
            RadioButton4.setText("Crab");
            level_label.setText("Hard 5");
            CorrectAnswer = "Cat";

            //Once the button submitted
            getValue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int selectedId = RadioBtnGroup.getCheckedRadioButtonId();
                    radioButton[0] = findViewById(selectedId);

                    playerAnswer = radioButton[0].getText().toString();

                    if (playerAnswer == "Cat") {
                        Toast.makeText(getApplicationContext(), "You've got a correct answer.", Toast.LENGTH_SHORT).show();

                        imageViewPlaceHolder.setImageResource(R.drawable.cat);
                        getValue.setVisibility(View.INVISIBLE);

                        remarks.setText("CORRECT");

                        Nextbtn.setVisibility(View.VISIBLE);

                    } else {
                        Toast.makeText(getApplicationContext(), "Wrong answer.", Toast.LENGTH_SHORT).show();
                        getValue.setVisibility(View.INVISIBLE);

                        imageViewPlaceHolder.setImageResource(R.drawable.cat);

                        correct_remarks.setText("Correct answer: Cat");

                        Nextbtn.setVisibility(View.VISIBLE);
                        Nextbtn.setText("Back");

                        Toast.makeText(getApplicationContext(), "Congratulations, you passed all the levels.", Toast.LENGTH_SHORT).show();


                    }

                    catsound.setLooping(false);

                    catsound.start();
                    Nextbtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            catsound.pause();

                            correct_remarks.setText("Mission Complete!");

                            Intent intent1 = new Intent(game_proper.this, mission_complete.class);
                            intent1.putExtra("level", 9);
                            startActivity(intent1);

                        }
                    });

                }

            });}

    }
}