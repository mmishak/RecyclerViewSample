package com.example.mmishak.recyclerviewsample;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class CatViewHolder extends RecyclerView.ViewHolder {

    public TextView title;
    public TextView description;

    public CatViewHolder(View itemView) {
        super(itemView);

        this.title = itemView.findViewById(R.id.title);
        this.description = itemView.findViewById(R.id.description);
    }
}
