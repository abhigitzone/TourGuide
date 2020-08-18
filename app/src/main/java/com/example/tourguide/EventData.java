package com.example.tourguide;

public class EventData {
    private String eventTitle;
    private String eventInfo;
    private String eventTime;
    private String eventLocation;
    private String eventWeb;
    private int eventImg;

    public EventData(String eventTitle, String eventInfo, String eventTime, String eventLocation, String eventWeb, int eventImg) {
        this.eventTitle = eventTitle;
        this.eventInfo = eventInfo;
        this.eventTime = eventTime;
        this.eventLocation = eventLocation;
        this.eventWeb = eventWeb;
        this.eventImg = eventImg;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public String getEventInfo() {
        return eventInfo;
    }

    public String getEventTime() {
        return eventTime;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public String getEventWeb() {
        return eventWeb;
    }

    public int getEventImg() {
        return eventImg;
    }
}
