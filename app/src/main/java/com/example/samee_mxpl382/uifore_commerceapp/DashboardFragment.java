package com.example.samee_mxpl382.uifore_commerceapp;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


/**
 * A simple {@link Fragment} subclass.
 */
public class DashboardFragment extends Fragment {


    ImageView ivmen,ivwomen,ivkids,ivelectronics,ivsports;
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
        ivkids=view.findViewById(R.id.ivkids);
        ivmen=view.findViewById(R.id.ivmen);
        ivelectronics=view.findViewById(R.id.ivelectronics);
        ivsports=view.findViewById(R.id.ivsports);
        Picasso.get().load("http://kidscreen.com/wp/wp-content/uploads/2011/02/fungoplay-300x150.jpg").into(ivkids);
        Picasso.get().load("http://kidscreen.com/wp/wp-content/uploads/2011/02/fungoplay-300x150.jpg").into(ivmen);
        Picasso.get().load("http://www.vignanits.ac.in/wordpress/wp-content/uploads/2015/12/Amazon-logo-700x433-300x150.jpg").into(ivwomen);
        Picasso.get().load("http://kidscreen.com/wp/wp-content/uploads/2011/02/fungoplay-300x150.jpg").into(ivelectronics);
        Picasso.get().load("http://www.vignanits.ac.in/wordpress/wp-content/uploads/2015/12/Amazon-logo-700x433-300x150.jpg").into(ivsports);
    }
}
