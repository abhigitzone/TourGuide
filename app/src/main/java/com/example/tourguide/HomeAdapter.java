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

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {
    Context mContext;
    List<HomeData> homeData;

    public HomeAdapter(Context mContext, List<HomeData> homeData) {
        this.mContext = mContext;
        this.homeData = homeData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.sample_home_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.homeTitle.setText(homeData.get(position).getHomeTitle());
        holder.homeInfo.setText(homeData.get(position).getHomeInfo());
        holder.homeTime.setText(homeData.get(position).getHomeTime());
        holder.homeLocation.setText(homeData.get(position).getHomeLocation());
        holder.homeWeb.setText(homeData.get(position).getHomeWeb());
        holder.homeImg.setImageResource(homeData.get(position).getHomeImg());

    }

    @Override
    public int getItemCount() {
        return homeData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView homeTitle;
        private TextView homeInfo;
        private TextView homeTime;
        private TextView homeLocation;
        private TextView homeWeb;
        private ImageView homeImg;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            homeTitle = itemView.findViewById(R.id.home_title);
            homeInfo = itemView.findViewById(R.id.home_info);
            homeTime = itemView.findViewById(R.id.home_time);
            homeLocation = itemView.findViewById(R.id.home_location);
            homeWeb = itemView.findViewById(R.id.home_web);
            homeImg = itemView.findViewById(R.id.home_img);

        }
    }
}
