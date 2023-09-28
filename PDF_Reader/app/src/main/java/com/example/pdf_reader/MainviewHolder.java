package com.example.pdf_reader;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MainviewHolder  extends RecyclerView.ViewHolder {

    public TextView txtName;
    public CardView cardView;


    public MainviewHolder(@NonNull View itemView) {
        super(itemView);

        txtName = itemView.findViewById(R.id.pdf_tx);
        cardView = itemView.findViewById(R.id.pdf_cardview);
    }
}
