package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterCountry extends RecyclerView.Adapter<AdapterCountry.ViewHolderCountries> {
    ArrayList<Pais> listCountries;

    public AdapterCountry(ArrayList<Pais> listCountries) {
        this.listCountries = listCountries;
    }

    @NonNull
    @Override
    public ViewHolderCountries onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewP = LayoutInflater.from(parent.getContext()).inflate(R.layout.item1, null, false);
        return new ViewHolderCountries(viewP);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderCountries holder, int position) {
        holder.nameCountry.setText(listCountries.get(position).getNombre());
        holder.descCountry.setText(listCountries.get(position).getDesc());
        holder.photoCountry.setImageResource(listCountries.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return listCountries.size();
    }

    public class ViewHolderCountries extends RecyclerView.ViewHolder {

        TextView descCountry, nameCountry;
        ImageView photoCountry;
        public ViewHolderCountries(@NonNull View itemView) {
            super(itemView);
            nameCountry = itemView.findViewById(R.id.tv_example);
            descCountry = itemView.findViewById(R.id.desc_example);
            photoCountry = itemView.findViewById(R.id.iv_example);
            photoCountry = itemView.findViewById(R.id.iv_example);
        }
    }
}
