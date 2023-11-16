package com.example.prueba_pre_15nov2023.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.prueba_pre_15nov2023.R;
import com.example.prueba_pre_15nov2023.models.DigimonModel;
import com.squareup.picasso.Picasso;

import java.util.List;

public class DigimonAdapter extends RecyclerView.Adapter<DigimonHolder> {

    private Context context;
    private List<DigimonModel> digimon;


    public DigimonAdapter(Context context, List<DigimonModel> digimon) {
        this.context = context;
        this.digimon = digimon;
    }

    @NonNull
    @Override
    public DigimonHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DigimonHolder(LayoutInflater.from(context).inflate(R.layout.item_digimon, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DigimonHolder holder, int position) {
        holder.getName().setText(digimon.get(position).getName());
        holder.getLevel().setText(digimon.get(position).getLevel());
        Picasso.get().load(digimon.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return digimon.size();
    }
}
