package com.example.samee_mxpl382.uifore_commerceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class GenericActivity extends AppCompatActivity {

    ArrayList<String>arrayList= new ArrayList<>();
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generic);
        rv=findViewById(R.id.rv);
        String s = getIntent().getStringExtra("object");
        if(s.contentEquals("kids")){
            arrayList.clear();
            arrayList.add("Toys Games");
            arrayList.add("Infant Wear");
            arrayList.add("Girls Clothing");
            arrayList.add("Boys Clothing");

        }
        else if(s.contentEquals("men")){

            arrayList.clear();
            arrayList.add("Clothing");
            arrayList.add("Men Accessories");
            arrayList.add("Footwear");
            arrayList.add("Watches");
        }
        else if(s.contentEquals("women")){

            arrayList.clear();
            arrayList.add("Western Wear");
            arrayList.add("Ethnic Wear");
            arrayList.add("Footwear");
            arrayList.add("Watches");
        }
        else if(s.contentEquals("electronics")){

            arrayList.clear();
            arrayList.add("Mobiles & Tablets");
            arrayList.add("Laptops & Computers");
            arrayList.add("Personal Care appliances");
            arrayList.add("Game zone");
            arrayList.add("Home appliances");
            arrayList.add("Kitchen Appliances");
        }
        else if(s.contentEquals("home")){
            arrayList.clear();
            arrayList.add("Kitchen & Dining");
            arrayList.add("Home Furnishing");
            arrayList.add("Hardware & Stationary");
            arrayList.add("Books & More");
        }
        else if(s.contentEquals("sports")){
            arrayList.clear();
            arrayList.add("Footwear");
            arrayList.add("Cricket");
            arrayList.add("Boxing");
            arrayList.add("Carrom Boards");

        }


        rv.setAdapter(new RvSectionAdapter(GenericActivity.this,arrayList));
        rv.setLayoutManager(new LinearLayoutManager(GenericActivity.this));
    }
}
