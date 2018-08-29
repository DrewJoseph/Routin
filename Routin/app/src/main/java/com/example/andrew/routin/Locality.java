package com.example.andrew.routin;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

import java.util.ArrayList;
import java.util.List;

public class Locality extends AppCompatActivity implements OnItemSelectedListener {

    private Spinner s1, s2;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locality);

        s1 = (Spinner) findViewById(R.id.spinner);
        s2 = (Spinner) findViewById(R.id.spinner2);
        s1.setOnItemSelectedListener(this);

        b2 = (Button) findViewById(R.id.button5);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Locality.this, Home.class);
                startActivity(i);
            }
        });

//        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                if(pos==1){
//                    s2.setAdapter(adapter2);
//                }
//                else{
//                    spinner2.setAdapter(adapter3) ;
//                }
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });

//        @Override
//        public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
//            // TODO Auto-generated method stub
//            String sp1= String.valueOf(s1.getSelectedItem());
////            Toast.makeText(this, sp1, Toast.LENGTH_SHORT).show();
//            if(sp1.contentEquals("Income")) {
//                List<String> list = new ArrayList<String>();
//                list.add("Salary");
//                list.add("Sales");
//                list.add("Others");
//                ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
//                        android.R.layout.simple_spinner_item, list);
//                dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//                dataAdapter.notifyDataSetChanged();
//                s2.setAdapter(dataAdapter);
//            }
//            if(sp1.contentEquals("Expense")) {
//                List<String> list = new ArrayList<String>();
//                list.add("Conveyance");
//                list.add("Breakfast");
//                list.add("Purchase");
//                ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
//                        android.R.layout.simple_spinner_item, list);
//                dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//                dataAdapter2.notifyDataSetChanged();
//                s2.setAdapter(dataAdapter2);
//            }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        String sp1 = String.valueOf(s1.getSelectedItem());
//            Toast.makeText(this, sp1, Toast.LENGTH_SHORT).show();
        if (sp1.contentEquals("Puducherry")) {
            List<String> list = new ArrayList<String>();
            list.add("Lawspet");
            list.add("Kalapet");
            list.add("Moolakulam");
            list.add("Muthialpet");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            s2.setAdapter(dataAdapter);
        }
        if (sp1.contentEquals("Bangalore")) {
            List<String> list = new ArrayList<String>();
            list.add("Radhanagar");
            list.add("Marathahalli");
            list.add("Indiranagar");
            list.add("Basaveshwar Nagar");
            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            s2.setAdapter(dataAdapter2);

        }
        if (sp1.contentEquals("Chennai")) {
            List<String> list = new ArrayList<String>();
            list.add("Adyar");
            list.add("Mylapore");
            list.add("Valasaravakkam");
            list.add("Ramapuram");
            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            s2.setAdapter(dataAdapter2);

        }
        if (sp1.contentEquals("Coimbatore")) {
            List<String> list = new ArrayList<String>();
            list.add("Gandhipuram");
            list.add("Saravarampatti");
            list.add("Race Course Road");
            list.add("R S Puram");
            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            s2.setAdapter(dataAdapter2);

        }
    }

        @Override
        public void onNothingSelected (AdapterView < ? > parent){

        }
    }
