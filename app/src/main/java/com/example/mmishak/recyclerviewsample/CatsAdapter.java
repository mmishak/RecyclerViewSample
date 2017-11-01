package com.example.mmishak.recyclerviewsample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class CatsAdapter extends RecyclerView.Adapter<CatViewHolder> {

    private List<Cat> cats;

    public CatsAdapter(List<Cat> cats) {
        this.cats = cats;
    }

    @Override
    public CatViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_cat, parent, false);
        return new CatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CatViewHolder holder, int position) {
        holder.title.setText(cats.get(position).getName());
        holder.description.setText(cats.get(position).getDescriptiion());
    }

    @Override
    public int getItemCount() {
        return cats.size();
    }
}
