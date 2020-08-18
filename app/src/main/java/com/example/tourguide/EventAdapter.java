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

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.MyViewHolder> {
    Context mContext;
    List<EventData> eventData;

    public EventAdapter(Context mContext, List<EventData> eventData) {
        this.mContext = mContext;
        this.eventData = eventData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.sample_event_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.eventTitle.setText(eventData.get(position).getEventTitle());
        holder.eventInfo.setText(eventData.get(position).getEventInfo());
        holder.eventTime.setText(eventData.get(position).getEventTime());
        holder.eventLocation.setText(eventData.get(position).getEventLocation());
        holder.eventWeb.setText(eventData.get(position).getEventWeb());
        holder.eventImg.setImageResource(eventData.get(position).getEventImg());
    }

    @Override
    public int getItemCount() {
        return eventData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView eventTitle;
        private TextView eventInfo;
        private TextView eventTime;
        private TextView eventLocation;
        private TextView eventWeb;
        private ImageView eventImg;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            eventTitle = itemView.findViewById(R.id.event_title);
            eventInfo = itemView.findViewById(R.id.event_info);
            eventTime = itemView.findViewById(R.id.event_time);
            eventLocation = itemView.findViewById(R.id.event_location);
            eventWeb = itemView.findViewById(R.id.event_web);
            eventImg = itemView.findViewById(R.id.event_Img);
        }
    }
}
