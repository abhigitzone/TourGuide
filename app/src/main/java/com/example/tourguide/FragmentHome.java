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

public class FragmentHome extends Fragment {
    List<HomeData> homeData;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.home_recycler);
        HomeAdapter homeAdapter = new HomeAdapter(getContext(), homeData);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(homeAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        homeData = new ArrayList<>();

        homeData.add(new HomeData(getString(R.string.home_title_3), getString(R.string.home_info_3), getString(R.string.home_time_1), getString(R.string.default_location), getString(R.string.home_web_1), R.drawable.royal_mile));
        homeData.add(new HomeData(getString(R.string.home_title_4), getString(R.string.home_info_4), getString(R.string.home_time_1), getString(R.string.default_location), getString(R.string.home_web_1), R.drawable.arthur_seat));
        homeData.add(new HomeData(getString(R.string.home_title_1), getString(R.string.home_info_1), getString(R.string.home_time_1), getString(R.string.home_location_1), getString(R.string.home_web_1), R.drawable.edinburgh_castel));
        homeData.add(new HomeData(getString(R.string.home_title_2), getString(R.string.home_info_2), getString(R.string.home_time_1), getString(R.string.home_location_2), getString(R.string.home_web_1), R.drawable.holyroodhouse));
        homeData.add(new HomeData(getString(R.string.home_title_5), getString(R.string.home_info_5), getString(R.string.home_time_1), getString(R.string.home_location_5), getString(R.string.home_web_5), R.drawable.national_gallery));
    }
}
