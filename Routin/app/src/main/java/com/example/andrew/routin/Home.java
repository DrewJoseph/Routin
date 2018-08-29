package com.example.andrew.routin;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.support.v7.widget.Toolbar;
import android.view.View;
import java.util.ArrayList;
import java.util.List;


public class Home extends AppCompatActivity implements ItemClickListener{

    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private List<Data> listData=new ArrayList<Data>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        initData();
        recyclerView=(RecyclerView)findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new RecyclerViewAdapter(listData);
        recyclerView.setAdapter(adapter);

        adapter.setClickListener(this);
    }

//    @Override
//    public void OnClick(View view,int position){
//
//    }

    private void initData() {
        listData.add(new Data(R.drawable.dairy,"untitled"));
        listData.add(new Data(R.drawable.breadfinal,"bread"));
        listData.add(new Data(R.drawable.untitled,"untitled"));
        listData.add(new Data(R.drawable.untitled,"untitled"));
        listData.add(new Data(R.drawable.untitled,"untitled"));
        listData.add(new Data(R.drawable.untitled,"untitled"));
        listData.add(new Data(R.drawable.dairy,"dairy"));

        listData.add(new Data(R.drawable.dairy,"dairy"));
        listData.add(new Data(R.drawable.dairy,"dairy"));
        listData.add(new Data(R.drawable.dairy,"dairy"));
        listData.add(new Data(R.drawable.dairy,"dairy"));
        listData.add(new Data(R.drawable.dairy,"dairy"));
        listData.add(new Data(R.drawable.dairy,"dairy"));
        listData.add(new Data(R.drawable.dairy,"dairy"));
    }


    @Override
    public void onClick(View view, int position) {
        final Data data=listData.get(position);
        Intent ix= new Intent();
        RecyclerView.ViewHolder c = new ViewHolder(view){};
        RecyclerViewAdapter o =new RecyclerViewAdapter(listData);
        RecyclerViewAdapter.ViewHolder d = o.new ViewHolder(view);
        switch(c.getAdapterPosition())
      {
          case 0:
              ix= new Intent(d.context,Dairy.class);
              break;
          case 1:
              ix= new Intent(d.context,Bread.class);
              break;
      }

       this.startActivity(ix);
    }

}
