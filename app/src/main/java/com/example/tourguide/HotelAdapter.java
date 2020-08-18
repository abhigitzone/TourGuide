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

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.MyViewHolder> {
    Context mContext;
    List<HotelData> hotelData;

    public HotelAdapter(Context mContext, List<HotelData> hotelData) {
        this.mContext = mContext;
        this.hotelData = hotelData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.sample_hotel_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.hotelTitle.setText(hotelData.get(position).getHotelTitle());
        holder.hotelInfo.setText(hotelData.get(position).getHotelInfo());
        holder.hotelPrice.setText(hotelData.get(position).getHotelPrice());
        holder.hotelTime.setText(hotelData.get(position).getHotelTime());
        holder.hotelLocation.setText(hotelData.get(position).getHotelLocation());
        holder.hotelWeb.setText(hotelData.get(position).getHotelWeb());
        holder.hotelImg.setImageResource(hotelData.get(position).getHotelImg());

    }

    @Override
    public int getItemCount() {
        return hotelData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView hotelTitle;
        private TextView hotelInfo;
        private TextView hotelPrice;
        private TextView hotelTime;
        private TextView hotelLocation;
        private TextView hotelWeb;
        private ImageView hotelImg;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            hotelTitle = itemView.findViewById(R.id.hotel_title);
            hotelInfo = itemView.findViewById(R.id.hotel_info);
            hotelPrice = itemView.findViewById(R.id.hotel_price);
            hotelTime = itemView.findViewById(R.id.hotel_time);
            hotelLocation = itemView.findViewById(R.id.hotel_location);
            hotelWeb = itemView.findViewById(R.id.hotel_web);
            hotelImg = itemView.findViewById(R.id.hotel_img);
        }
    }
}
