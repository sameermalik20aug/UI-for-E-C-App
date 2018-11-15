package com.example.samee_mxpl382.uifore_commerceapp;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.ms.square.android.expandabletextview.ExpandableTextView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ProductActivity extends AppCompatActivity {

    ImageView iv;
    static  ArrayList<Product> CartarrayList=new ArrayList<>();
    Button btnCart,btnBuy;
    ExpandableTextView expandableTextView,expandableTextView2;
    int q;
    RecyclerView rv;
    TextView plus,tvTitle,tvPrice,quant,minus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        String title=getIntent().getStringExtra("title");
        int price=getIntent().getIntExtra("price",1);
        String url=getIntent().getStringExtra("image");
        String desc=getIntent().getStringExtra("desc");
        final Product p = getIntent().getExtras().getParcelable("object");
        q=1;
//        Picasso.get().load(url).placeholder(R.drawable.ic_launcher_foreground).into(iv);
        Log.e("TAG2",url);
        iv=findViewById(R.id.iv);
        btnBuy=findViewById(R.id.btnBuy);
        btnCart=findViewById(R.id.btnCart);
        btnCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Log.e("TAG1","BtnCart");
                    Intent i= new Intent(ProductActivity.this,MainActivity.class);
                    Log.e("TAG1",p.getPtitle());
                    i.putExtra("object",p);
                    startActivity(i);
//                  CartarrayList.add(p);
//
//                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//                Fragment fragment = CartFragment.newInstance(p);
//                ft.replace(R.id.main_container, fragment);
//                ft.commit();
            }
        });
        rv=findViewById(R.id.rv);
        Picasso.get().load(url).placeholder(R.drawable.ic_launcher_foreground).into(iv);
        tvTitle=findViewById(R.id.tvTitle);
        tvPrice=findViewById(R.id.tvPrice);
        expandableTextView=findViewById(R.id.expand_text_view);
        expandableTextView.setText(desc);
        expandableTextView2=findViewById(R.id.expand_text_view2);
        expandableTextView2.setText(desc);
        tvTitle.setText(title);
        minus=findViewById(R.id.minus);
        plus=findViewById(R.id.plus);
        quant=findViewById(R.id.quant);
        quant.setText(""+q);
        tvPrice.setText("Rs. "+price);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q=q+1;
                quant.setText(""+q);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(q>1){

                    q=q-1;
                    quant.setText(""+q);
                }
            }
        });
        Product p1=new Product();
        ArrayList<Product> arrayList=p1.getProoduct();
        rv.setLayoutManager(new LinearLayoutManager(ProductActivity.this,LinearLayoutManager.HORIZONTAL,false));
        rv.setAdapter(new RecyclerViewAdapter(ProductActivity.this,arrayList));

    }
//    public ArrayList<Product> getwish(){
//
//        return CartarrayList;
//
//    }
}
