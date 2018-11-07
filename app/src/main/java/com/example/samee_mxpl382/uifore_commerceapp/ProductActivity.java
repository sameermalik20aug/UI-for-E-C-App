package com.example.samee_mxpl382.uifore_commerceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ms.square.android.expandabletextview.ExpandableTextView;
import com.squareup.picasso.Picasso;

public class ProductActivity extends AppCompatActivity {

    ImageView iv;
    ExpandableTextView expandableTextView;
    int q;
    TextView plus,tvTitle,tvPrice,quant,minus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        String title=getIntent().getStringExtra("title");
        int price=getIntent().getIntExtra("price",1);
        String url=getIntent().getStringExtra("image");
        String desc=getIntent().getStringExtra("desc");
        q=1;
//        Picasso.get().load(url).placeholder(R.drawable.ic_launcher_foreground).into(iv);
        Log.e("TAG2",url);
        iv=findViewById(R.id.iv);
        Picasso.get().load(url).placeholder(R.drawable.ic_launcher_foreground).into(iv);
        tvTitle=findViewById(R.id.tvTitle);
        tvPrice=findViewById(R.id.tvPrice);
        expandableTextView=findViewById(R.id.expand_text_view);
        expandableTextView.setText(desc);
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

    }
}
