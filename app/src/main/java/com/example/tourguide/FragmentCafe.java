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

public class FragmentCafe extends Fragment {
    List<CafeData> cafeData;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.cafe_fragment, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.cafe_recycler);
        CafeAdapter cafeAdapter = new CafeAdapter(getActivity(), cafeData);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(cafeAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        cafeData = new ArrayList<>();

        cafeData.add(new CafeData(getString(R.string.cafe_title_1), getString(R.string.cafe_info_1), getString(R.string.cafe_price_1), getString(R.string.cafe_time_1), getString(R.string.cafe_location_1), getString(R.string.cafe_web_1), R.drawable.voujon));
        cafeData.add(new CafeData(getString(R.string.cafe_title_2), getString(R.string.cafe_info_2), getString(R.string.cafe_price_2), getString(R.string.cafe_time_2), getString(R.string.cafe_location_2), getString(R.string.cafe_web_2), R.drawable.codita));
        cafeData.add(new CafeData(getString(R.string.cafe_title_3), getString(R.string.cafe_info_3), getString(R.string.cafe_price_3), getString(R.string.cafe_time_3), getString(R.string.cafe_location_3), getString(R.string.cafe_web_3), R.drawable.stockbridge));
        cafeData.add(new CafeData(getString(R.string.cafe_title_4), getString(R.string.cafe_info_4), getString(R.string.cafe_price_4), getString(R.string.cafe_time_4), getString(R.string.cafe_location_4), getString(R.string.cafe_web_4), R.drawable.cafe_grande));
        cafeData.add(new CafeData(getString(R.string.cafe_title_5), getString(R.string.cafe_info_5), getString(R.string.cafe_price_5), getString(R.string.cafe_time_5), getString(R.string.cafe_location_5), getString(R.string.cafe_web_5), R.drawable.aurora));

    }
}
