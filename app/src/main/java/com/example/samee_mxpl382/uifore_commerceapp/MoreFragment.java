package com.example.samee_mxpl382.uifore_commerceapp;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MoreFragment extends Fragment {

    ArrayList<String> arrayList=new ArrayList<>();
    RecyclerView rv;
    public MoreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_more, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rv=view.findViewById(R.id.rv);
        arrayList.add("Account Dashboard");
        arrayList.add("Account Information");
        arrayList.add("Wallet History");
        arrayList.add("My Orders");
        arrayList.add("My Wishlist");
        arrayList.add("Withdraw");
        rv.setAdapter(new RvSectionAdapter(getContext(),arrayList));
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
    }
}
