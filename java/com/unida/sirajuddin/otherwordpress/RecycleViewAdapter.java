package com.unida.sirajuddin.otherwordpress;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter {

    private ArrayList<Model> dataset;
    private Context context;

    public RecycleViewAdapter(ArrayList<Model> mlist, Context context){
        this.dataset = mlist;
        this.context = context;
    }

    public static class ImageTypeViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView mtitle,msubtitle;
        public ImageTypeViewHolder(@NonNull View itemView) {
            super(itemView);

            this.mtitle = itemView.findViewById(R.id.title);
            this.msubtitle = itemView.findViewById(R.id.subtitle);
            this.imageView = itemView.findViewById(R.id.icont);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.postdetails, parent, false);
        return new ImageTypeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
            final Model object = dataset.get(position);
        ((ImageTypeViewHolder)holder).mtitle.setText(object.title);
        ((ImageTypeViewHolder)holder).msubtitle.setText(object.subtitle);

    }



    @Override
    public int getItemCount() { return dataset.size();
    }
}
