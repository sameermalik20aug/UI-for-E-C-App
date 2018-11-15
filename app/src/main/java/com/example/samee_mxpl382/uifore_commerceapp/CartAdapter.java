package com.example.samee_mxpl382.uifore_commerceapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder> {
    Context cxt;
    ArrayList<Product> arrayList;

    public CartAdapter(Context cxt, ArrayList<Product> arrayList) {
        this.cxt = cxt;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public CartAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflate=LayoutInflater.from(cxt);
        View view = layoutInflate.inflate(R.layout.cart_item,viewGroup,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull CartAdapter.ViewHolder viewHolder, int i) {
        Product p =arrayList.get(i);
        Picasso.get().load(p.getImg()).into(viewHolder.iv);
        viewHolder.tvPrice.setText(""+p.getPrice());
        viewHolder.tvTitle.setText(""+p.getPtitle());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView tvTitle,tvPrice,plus,quant,minus;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iv=itemView.findViewById(R.id.iv);
            tvTitle=itemView.findViewById(R.id.tvTitle);
            quant=itemView.findViewById(R.id.quant);
            minus=itemView.findViewById(R.id.minus);
            plus=itemView.findViewById(R.id.plus);
            tvPrice=itemView.findViewById(R.id.tvPrice);
        }
    }
}
