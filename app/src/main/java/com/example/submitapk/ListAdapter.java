package com.example.submitapk;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.CategoryViewHolder> {
    private Context context;
    private ArrayList<Car> listLapie;

    public ListAdapter(Context context) {
        this.context = context;
    }


    public ArrayList<Car> getListPresident() {
        return listLapie;
    }

    public void setListPresident(ArrayList<Car> listLapie) {
        this.listLapie = listLapie;
    }




    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int position) {
        categoryViewHolder.tvModel.setText(getListPresident().get(position).getModel());
        categoryViewHolder.tvDesc.setText(getListPresident().get(position).getDesc());
        Glide.with(context)
                .load(getListPresident().get(position).getImg())
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListPresident().size();

    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvModel;
        TextView tvDesc;
        ImageView imgPhoto;
        CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvModel = itemView.findViewById(R.id.tv_item_name);
            tvDesc = itemView.findViewById(R.id.tv_item_desc);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}