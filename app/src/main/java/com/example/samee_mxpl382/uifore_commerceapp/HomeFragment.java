package com.example.samee_mxpl382.uifore_commerceapp;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }

    ViewPager vp;
    RecyclerView rv,rv2;
    ArrayList<Product> arrayList= new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        vp=view.findViewById(R.id.vp);
        rv=view.findViewById(R.id.rv);
        rv2=view.findViewById(R.id.rv2);
        vp.setAdapter(new vpAdapter(getContext()));
        arrayList.add(new Product("https://catchthemes.com/demo/catch-responsive/files/2013/03/image-alignment-150x150.jpg","XYZ1",1501));
        arrayList.add(new Product("https://catchthemes.com/demo/catch-responsive/files/2013/03/image-alignment-150x150.jpg","XYZ2",1502));
        arrayList.add(new Product("https://catchthemes.com/demo/catch-responsive/files/2013/03/image-alignment-150x150.jpg","XYZ3",1503));
        arrayList.add(new Product("https://catchthemes.com/demo/catch-responsive/files/2013/03/image-alignment-150x150.jpg","XYZ4",1504));
        arrayList.add(new Product("https://catchthemes.com/demo/catch-responsive/files/2013/03/image-alignment-150x150.jpg","XYZ5",1505));

        rv.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        rv.setAdapter(new RecyclerViewAdapter(getContext(),arrayList));
        rv2.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        rv2.setAdapter(new RecyclerViewAdapter(getContext(),arrayList));
    }

    private class vpAdapter extends PagerAdapter {
        LayoutInflater layoutInflater;
        Context cxt;

        public vpAdapter(Context cxt) {
            this.cxt = cxt;
            layoutInflater=(LayoutInflater) cxt.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {

            return view==((LinearLayout)o);
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            View view=layoutInflater.inflate(R.layout.vp_item,container,false);
            ImageView iv=view.findViewById(R.id.iv);
            Picasso.get().load("https://picsum.photos/200/300/?random").into(iv);
            container.addView(view);
            return view;
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            container.removeView((LinearLayout) object);
        }
    }
}
