package com.example.bottomsheetcoordinatorlayoutdemo;/*
 * create by young.lv on 2020/10/27 4:53 PM
 */

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MAdapter extends RecyclerView.Adapter<MAdapter.MHolder> {


    @NonNull
    @Override
    public MHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bottomsheet,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 15;
    }

   static class MHolder extends RecyclerView.ViewHolder{


        public MHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
