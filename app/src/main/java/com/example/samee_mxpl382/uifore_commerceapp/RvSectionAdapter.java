package com.example.samee_mxpl382.uifore_commerceapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RvSectionAdapter extends RecyclerView.Adapter<RvSectionAdapter.ViewHolder> {
    Context cxt;
    ArrayList<String> arrayList;

    public RvSectionAdapter(Context cxt, ArrayList<String> arrayList) {
        this.cxt = cxt;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RvSectionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater=LayoutInflater.from(cxt);
        View view=layoutInflater.inflate(R.layout.section_item,viewGroup,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RvSectionAdapter.ViewHolder viewHolder, int i) {

        viewHolder.tv.setText(arrayList.get(i));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv=itemView.findViewById(R.id.tv);
        }
    }
}
