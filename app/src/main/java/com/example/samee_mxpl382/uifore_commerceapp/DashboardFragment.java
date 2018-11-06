package com.example.samee_mxpl382.uifore_commerceapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class DashboardFragment extends Fragment {


    ArrayList<String> arrayList=new ArrayList<>();
    ImageView ivmen,ivwomen,ivkids,ivelectronics,ivsports,ivhomekitchen;
    public DashboardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dashboard, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ivwomen=view.findViewById(R.id.ivwomen);
        ivwomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),GenericActivity.class);
                i.putExtra("object","women");
                startActivity(i);
            }
        });
        ivkids=view.findViewById(R.id.ivkids);
        ivkids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),GenericActivity.class);
                i.putExtra("object","kids");
                startActivity(i);
            }
        });
        ivmen=view.findViewById(R.id.ivmen);
        ivmen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),GenericActivity.class);
                i.putExtra("object","men");
                startActivity(i);
            }
        });
        ivelectronics=view.findViewById(R.id.ivelectronics);
        ivelectronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),GenericActivity.class);
                i.putExtra("object","electronics");
                startActivity(i);
            }
        });
        ivsports=view.findViewById(R.id.ivsports);
        ivsports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),GenericActivity.class);
//                i.putStringArrayListExtra("arraylist", arrayList);
                i.putExtra("object","sports");
                startActivity(i);
            }
        });
        ivhomekitchen=view.findViewById(R.id.ivhomekitchen);
        ivhomekitchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),GenericActivity.class);
                i.putExtra("object","home");
                startActivity(i);
            }
        });
        Picasso.get().load("https://cdn.shopify.com/s/files/1/2625/1454/files/kids_fashion_clothing_4868a552-fdd6-4814-ae25-8e5910b095d7_300x300.jpg?v=1539620066").into(ivkids);
        Picasso.get().load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSPRcaiFGyJABaOPQ_AGrUr7iKYxnPQW67zrfwW9A8otK3uh-pBQA").into(ivmen);
        Picasso.get().load("https://images.asos-media.com/products/dusty-daze-oversized-sequin-swing-dress/10507878-1-blacksequin?$XL$?$XXL$&wid=300&fmt=jpeg&qlt=80,0&op_sharpen=0&resMode=sharp2&op_usm=1,0.4,6,1&iccEmbed=0&printRes=72").into(ivwomen);
        Picasso.get().load("https://i1.wp.com/myfaayda.com/wp-content/uploads/2018/03/MarQ-Semi-Automatic-Top-Load-Washing-Machine-300x300.jpeg").into(ivelectronics);
        Picasso.get().load("https://sc01.alicdn.com/kf/HTB1.8x_RFXXXXcqaXXXq6xXFXXXf/Cool-Design-old-gym-equipment-sale-one.jpg_300x300.jpg").into(ivsports);
        Picasso.get().load("https://3.bp.blogspot.com/-hovq8uPv_RE/VvAG5tYjfSI/AAAAAAAAV7U/GsECMMjZu3chX-bN5xZQL81INdB2hHhAw/s1600/Kitchen%2BSale%2B22x28-horz.jpg").into(ivhomekitchen);

    }
}
