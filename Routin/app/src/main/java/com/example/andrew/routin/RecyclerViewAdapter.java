package com.example.andrew.routin;

import android.content.ClipData;
import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

// class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
//
//         private ItemClickListener clickListener;
//         public ImageButton ib1;
//
//         public RecyclerViewHolder(View itemView) {
//             super(itemView);
//             ib1 = itemView.findViewById(R.id.imagebutton1);
//
//         }
//}

    public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
//        public  ImageButton ib1;
        private ItemClickListener clickListener;
        private List<Data> listData = new ArrayList<Data>();



//         public RecyclerViewHolder(View itemView) {
//             super(itemView);

//
//         }

        public RecyclerViewAdapter(List<Data> listData) {
            this.listData = listData;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            View itemView = inflater.inflate(R.layout.item, parent, false);
            return new ViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            holder.imageButton.setImageResource(listData.get(position).getImageID());

        }

        @Override
        public int getItemCount() {
            return listData.size();
        }


    public void setClickListener(ItemClickListener itemClickListener) {
        this.clickListener = itemClickListener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final Context context;

        public ImageButton imageButton;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageButton = (ImageButton) itemView.findViewById(R.id.imagebutton1);
            itemView.setTag(itemView);
            itemView.setOnClickListener(this);
            context =itemView.getContext();
        }

        @Override
        public void onClick(View v) {
            if (clickListener != null) clickListener.onClick(v, getAdapterPosition());
        }

    }
}