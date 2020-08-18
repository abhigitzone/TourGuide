package com.example.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentEvent extends Fragment {
    List<EventData> eventData;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.event_fragment, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.event_recycler);
        EventAdapter eventAdapter = new EventAdapter(getContext(), eventData);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(eventAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        eventData = new ArrayList<>();

        eventData.add(new EventData(getString(R.string.event_title_5), getString(R.string.event_info_5), getString(R.string.event_time_5), getString(R.string.event_location_1), getString(R.string.event_web_5), R.drawable.international_festival));
        eventData.add(new EventData(getString(R.string.event_title_1), getString(R.string.event_info_1), getString(R.string.event_time_1), getString(R.string.event_location_1), getString(R.string.event_web_1), R.drawable.film_festival));
        eventData.add(new EventData(getString(R.string.event_title_2), getString(R.string.event_info_2), getString(R.string.event_time_2), getString(R.string.event_location_1), getString(R.string.event_web_2), R.drawable.hogmanay));
        eventData.add(new EventData(getString(R.string.event_title_3), getString(R.string.event_info_3), getString(R.string.event_time_3), getString(R.string.event_location_1), getString(R.string.event_web_3), R.drawable.science_festival));
        eventData.add(new EventData(getString(R.string.event_title_4), getString(R.string.event_info_4), getString(R.string.event_time_4), getString(R.string.event_location_1), getString(R.string.event_web_4), R.drawable.military_tattoo));
    }
}
