package com.example.tourguide;

public class HotelData {
    private String hotelTitle;
    private String hotelInfo;
    private String hotelPrice;
    private String hotelTime;
    private String hotelLocation;
    private String hotelWeb;
    private int hotelImg;

    public HotelData(String hotelTitle, String hotelInfo, String hotelPrice, String hotelTime, String hotelLocation, String hotelWeb, int hotelImg) {
        this.hotelTitle = hotelTitle;
        this.hotelInfo = hotelInfo;
        this.hotelPrice = hotelPrice;
        this.hotelTime = hotelTime;
        this.hotelLocation = hotelLocation;
        this.hotelWeb = hotelWeb;
        this.hotelImg = hotelImg;
    }

    public String getHotelTitle() {
        return hotelTitle;
    }

    public String getHotelInfo() {
        return hotelInfo;
    }

    public String getHotelPrice() {
        return hotelPrice;
    }

    public String getHotelTime() {
        return hotelTime;
    }

    public String getHotelLocation() {
        return hotelLocation;
    }

    public String getHotelWeb() {
        return hotelWeb;
    }

    public int getHotelImg() {
        return hotelImg;
    }
}
