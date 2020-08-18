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

public class FragmentHotel extends Fragment {
    List<HotelData> hotelData;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.hotel_fragment, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.hotel_recycler);
        HotelAdapter hotelAdapter = new HotelAdapter(getContext(), hotelData);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(hotelAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hotelData = new ArrayList<>();

        hotelData.add(new HotelData(getString(R.string.hotel_title_1), getString(R.string.hotel_info_1), getString(R.string.hotel_price_1), getString(R.string.hotel_default_time), getString(R.string.hotel_location_1), getString(R.string.hotel_web_1), R.drawable.ediburgh_grand));
        hotelData.add(new HotelData(getString(R.string.hotel_title_2), getString(R.string.hotel_info_2), getString(R.string.hotel_price_2), getString(R.string.hotel_default_time), getString(R.string.hotel_location_2), getString(R.string.hotel_web_2), R.drawable.dustane_house));
        hotelData.add(new HotelData(getString(R.string.hotel_title_3), getString(R.string.hotel_info_3), getString(R.string.hotel_price_3), getString(R.string.hotel_default_time), getString(R.string.hotel_location_3), getString(R.string.hotel_web_3), R.drawable.eden_locke));
        hotelData.add(new HotelData(getString(R.string.hotel_title_4), getString(R.string.hotel_info_4), getString(R.string.hotel_price_4), getString(R.string.hotel_default_time), getString(R.string.hotel_location_4), getString(R.string.hotel_web_4), R.drawable.raddison));
        hotelData.add(new HotelData(getString(R.string.hotel_title_5), getString(R.string.hotel_info_5), getString(R.string.hotel_price_5), getString(R.string.hotel_default_time), getString(R.string.hotel_location_5), getString(R.string.hotel_web_5), R.drawable.rock_house));
    }
}
