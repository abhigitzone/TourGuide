package com.example.tourguide;

public class CafeData {
    private String cafeTitle;
    private String cafeInfo;
    private String cafePrice;
    private String cafeTime;
    private String cafeLocation;
    private String cafeWeb;
    private int cafeImg;

    public CafeData(String cafeTitle, String cafeInfo, String cafePrice, String cafeTime, String cafeLocation, String cafeWeb, int cafeImg) {
        this.cafeTitle = cafeTitle;
        this.cafeInfo = cafeInfo;
        this.cafePrice = cafePrice;
        this.cafeTime = cafeTime;
        this.cafeLocation = cafeLocation;
        this.cafeImg = cafeImg;
        this.cafeWeb = cafeWeb;
    }

    public int getCafeImg() {
        return cafeImg;
    }

    public String getCafeTitle() {
        return cafeTitle;
    }

    public String getCafeInfo() {
        return cafeInfo;
    }

    public String getCafePrice() {
        return cafePrice;
    }

    public String getCafeTime() {
        return cafeTime;
    }

    public String getCafeLocation() {
        return cafeLocation;
    }

    public String getCafeWeb() {
        return cafeWeb;
    }
}
