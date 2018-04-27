package com.example.christinm.triptravel;

public class Trips {
    private String id;
    private String trip_name;
    private String from;
    private String to;
    private String price;
    private String date;


    public Trips(String name , String FROM , String TO , String Price , String datee)
    {
        this.trip_name = name;
        this.from = FROM;
        this.to = TO;
        this.price = Price;
        this.date = datee;
    }

    public Trips() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTrip_name() {
        return trip_name;
    }

    public void setTrip_name(String trip_name) {
        this.trip_name = trip_name;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
