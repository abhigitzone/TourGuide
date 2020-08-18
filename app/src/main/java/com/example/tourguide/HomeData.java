package com.example.tourguide;

public class HomeData {
    private String homeTitle;
    private String homeInfo;
    private String homeTime;
    private String homeLocation;
    private String homeWeb;
    private int homeImg;

    public HomeData(String homeTitle, String homeInfo, String homeTime, String homeLocation, String homeWeb, int homeImg) {
        this.homeTitle = homeTitle;
        this.homeInfo = homeInfo;
        this.homeTime = homeTime;
        this.homeLocation = homeLocation;
        this.homeWeb = homeWeb;
        this.homeImg = homeImg;
    }

    public int getHomeImg() {
        return homeImg;
    }

    public String getHomeTitle() {
        return homeTitle;
    }

    public String getHomeInfo() {
        return homeInfo;
    }

    public String getHomeTime() {
        return homeTime;
    }

    public String getHomeLocation() {
        return homeLocation;
    }

    public String getHomeWeb() {
        return homeWeb;
    }
}
