package com.example.andrew.routin;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView t1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        t1=(TextView)findViewById(R.id.textView2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                try{
                    String number=t1.getText().toString();
                    Long n=Long.parseLong(number);
                    if(n>999999999) {
                        startActivity(new Intent(MainActivity.this, OTP.class));
                    }
//                }
//                catch (Exception e)
                    else{
                        Toast.makeText(getApplicationContext(),"Enter Phone Number",Toast.LENGTH_SHORT).show();
                }



//                Intent i=new Intent(MainActivity.this,OTP.class);
//                startActivity(i);
            }
        });


    }
}
