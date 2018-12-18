package com.example.testandroid.controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.testandroid.model.MainMenu;

import java.util.ArrayList;

public class AdapterRecyclerMenu extends RecyclerView.Adapter<AdapterRecyclerMenu.ViewHolder> {
    private ArrayList<MainMenu> modelMenus;
    public AdapterRecyclerMenu(ArrayList<MainMenu> modelMenus) {
        this.modelMenus = modelMenus;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    }
    @Override
    public int getItemCount() {
        if (modelMenus != null) {
            return modelMenus.size();
        } else {
            return 0;
        }
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
    public void updateData(ArrayList<MainMenu> listNonCoffe) {
        this.modelMenus = listNonCoffe;
        notifyDataSetChanged();
    }
}
