package com.example.samee_mxpl382.uifore_commerceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class WomenSection extends AppCompatActivity {

    RecyclerView rv;
    ArrayList<String> arrayList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women_section);
        rv=findViewById(R.id.rv);
        arrayList.add("Western Wear");
        arrayList.add("Ethnic Wear");
        arrayList.add("Footwear");
        arrayList.add("Watches");
        rv.setAdapter(new RvSectionAdapter(WomenSection.this,arrayList));
        rv.setLayoutManager(new LinearLayoutManager(WomenSection.this));
    }
}
