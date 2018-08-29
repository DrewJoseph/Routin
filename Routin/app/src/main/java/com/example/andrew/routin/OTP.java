package com.example.andrew.routin;

import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.icu.text.AlphabeticIndex;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.String.valueOf;

public class OTP extends AppCompatActivity {
    Button b2, b3;
    TextView t1;

    CountDownTimer c;

    //    start();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });


        b2 = (Button) findViewById(R.id.button4);

        b2.setVisibility(View.INVISIBLE);
        b2.postDelayed(new Runnable() {
            @Override
            public void run() {
                b2.setVisibility(View.VISIBLE);
            }
        }, 30000);

        b3 = (Button) findViewById(R.id.button2);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OTP.this, Signup.class);
                startActivity(i);

            }
        });


        c = new CountDownTimer(30000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                t1.setText(valueOf(millisUntilFinished / 1000));
            }

            @Override
            public void onFinish() {
//                    b2.setVisibility(View.VISIBLE);
                t1.setText("");
            }
        }.start();

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent i = new Intent(OTP.this, Signup.class);
//                startActivity(i);



            }
        });
        t1 = (TextView) findViewById(R.id.textView8);


//        public void start(){
//        t1.setText("30");


        }
    }

