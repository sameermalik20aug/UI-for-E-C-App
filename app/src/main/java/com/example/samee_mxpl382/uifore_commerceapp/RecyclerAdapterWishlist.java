package com.example.samee_mxpl382.uifore_commerceapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RecyclerAdapterWishlist extends RecyclerView.Adapter<RecyclerAdapterWishlist.ViewHolder>{
    Context cxt;
    ArrayList<Product> arrayList;

    public RecyclerAdapterWishlist(Context cxt, ArrayList<Product> arrayList) {
        this.cxt = cxt;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RecyclerAdapterWishlist.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflate=LayoutInflater.from(cxt);
        View view = layoutInflate.inflate(R.layout.wishlist_item,viewGroup,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapterWishlist.ViewHolder viewHolder, final int i) {
        final Product p = arrayList.get(i);
        Log.e("TAG",""+p.getPtitle());
        viewHolder.tvTitle.setText(p.getPtitle());
        viewHolder.tvPrice.setText(""+p.getPrice());

        Log.e("TAG2",""+p.getPrice());
        Picasso.get().load(p.getImg()).into(viewHolder.iv);

        viewHolder.iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayList.remove(i);
                notifyDataSetChanged();
            }
        });
        viewHolder.iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cxt,ProductActivity.class);
                i.putExtra("title",p.getPtitle());
                i.putExtra("price",p.getPrice());
                i.putExtra("image",p.getImg());
                i.putExtra("desc",p.getDesc());
                cxt.startActivity(i);
            }
        });
        viewHolder.tvTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cxt,ProductActivity.class);
                i.putExtra("title",p.getPtitle());
                i.putExtra("price",p.getPrice());
                i.putExtra("image",p.getImg());
                i.putExtra("desc",p.getDesc());
                cxt.startActivity(i);
            }
        });
        viewHolder.tvPrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cxt,ProductActivity.class);
                i.putExtra("title",p.getPtitle());
                i.putExtra("price",p.getPrice());
                i.putExtra("image",p.getImg());
                i.putExtra("desc",p.getDesc());
                cxt.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle,tvPrice;
        ImageView iv,iv2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle=itemView.findViewById(R.id.tvTitle);
            tvPrice=itemView.findViewById(R.id.tvPrice);
            iv=itemView.findViewById(R.id.iv);
            iv2=itemView.findViewById(R.id.iv2);
        }
    }
}
