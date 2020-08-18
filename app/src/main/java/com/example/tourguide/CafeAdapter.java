package com.example.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CafeAdapter extends RecyclerView.Adapter<CafeAdapter.MyViewHolder> {
    Context mContext;
    List<CafeData> cafeData;

    public CafeAdapter(Context mContext, List<CafeData> cafeData) {
        this.mContext = mContext;
        this.cafeData = cafeData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.sample_cafe_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.cafeTitle.setText(cafeData.get(position).getCafeTitle());
        holder.cafeInfo.setText(cafeData.get(position).getCafeInfo());
        holder.cafePrice.setText(cafeData.get(position).getCafePrice());
        holder.cafeTime.setText(cafeData.get(position).getCafeTime());
        holder.cafeLocation.setText(cafeData.get(position).getCafeLocation());
        holder.cafeWeb.setText(cafeData.get(position).getCafeWeb());
        holder.cafeImg.setImageResource(cafeData.get(position).getCafeImg());

    }

    @Override
    public int getItemCount() {
        return cafeData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView cafeTitle;
        private TextView cafeInfo;
        private TextView cafePrice;
        private TextView cafeTime;
        private TextView cafeLocation;
        private TextView cafeWeb;
        private ImageView cafeImg;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            cafeTitle = itemView.findViewById(R.id.cafe_title);
            cafeInfo = itemView.findViewById(R.id.cafe_info);
            cafePrice = itemView.findViewById(R.id.cafe_price);
            cafeTime = itemView.findViewById(R.id.cafe_time);
            cafeLocation = itemView.findViewById(R.id.cafe_location);
            cafeWeb = itemView.findViewById(R.id.cafe_web);
            cafeImg = itemView.findViewById(R.id.cafe_Img);
        }
    }
}
