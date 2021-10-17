package com.example.recyclarview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import foodAdapter.AdapterNew;
import foodmodels.foodClass;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        ArrayList<foodClass> list = new ArrayList<>();
        list.add(new foodClass(R.drawable.food1,"BURGER"));
        list.add(new foodClass(R.drawable.food2,"PIZZA"));
        list.add(new foodClass(R.drawable.food1,"BURGER"));
        list.add(new foodClass(R.drawable.food2,"PIZZA"));
        list.add(new foodClass(R.drawable.food1,"BURGER"));
        list.add(new foodClass(R.drawable.food2,"PIZZA"));
        list.add(new foodClass(R.drawable.food1,"BURGER"));
        list.add(new foodClass(R.drawable.food2,"PIZZA"));

        AdapterNew adapterNew = new AdapterNew(list,this);
        recyclerView.setAdapter(adapterNew);

        /*LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);*/
        /*LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);*/
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);
    }
}