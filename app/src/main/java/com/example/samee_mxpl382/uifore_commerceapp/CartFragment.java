package com.example.samee_mxpl382.uifore_commerceapp;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class CartFragment extends Fragment {

    RecyclerView rv;
    ArrayList<Product> productArrayList= new ArrayList<>();

    private static final String DESCRIBABLE_KEY = "describable_key";
    private Product product;

    public static CartFragment newInstance(Product p) {
        CartFragment fragment = new CartFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(DESCRIBABLE_KEY, p);
        fragment.setArguments(bundle);

        return fragment;
    }

    public CartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cart, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rv=view.findViewById(R.id.rv);


        if (getArguments() != null) {
            product = (Product) getArguments().getParcelable(
                    DESCRIBABLE_KEY);
            Log.e("TAG1Cart", product.getPtitle());
            productArrayList.add(product);

            CartAdapter cartAdapter= new CartAdapter(getContext(),productArrayList);
            rv.setAdapter(cartAdapter);
            rv.setLayoutManager(new LinearLayoutManager(getContext()));
        }
    }
}
