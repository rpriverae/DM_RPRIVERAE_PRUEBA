package com.example.prueba_pre_15nov2023.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.prueba_pre_15nov2023.R;

public class DigimonHolder extends RecyclerView.ViewHolder {
    private TextView name;
    private ImageView img;
    private TextView level;

    public DigimonHolder(@NonNull View viewItem) {
        super(viewItem);
        name = viewItem.findViewById(R.id.name);
        img = viewItem.findViewById(R.id.imageView);
        level = viewItem.findViewById(R.id.level);
    }

    public TextView getName() {
        return name;
    }

    public ImageView getImg() {
        return img;
    }

    public TextView getLevel() {
        return level;
    }
}
