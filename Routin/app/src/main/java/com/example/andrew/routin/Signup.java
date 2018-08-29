package com.example.andrew.routin;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Signup extends AppCompatActivity {
Button b3;
ImageView person;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        person= findViewById(R.id.imageView);
        b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Signup.this, Locality.class);
                startActivity(i);
            }
        });

        RadioGroup r=(RadioGroup)findViewById(R.id.radioGroup);
        r.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {


                switch (checkedId){
                    case R.id.radioButton:
                            person.setImageResource(R.drawable.man_in_pink);
                        break;
                    case R.id.radioButton2:
                            person.setImageResource(R.drawable.lady_im_pink);
                        break;
                }
            }
        });

        }

    public void onRadioButtonClicked(View view){

    }
}
