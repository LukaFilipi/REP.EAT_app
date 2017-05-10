package com.example.android.repeat;

/**
 * Created by Luka Filipi on 19/02/2017.
 */

public class Restaurant {
    private String name;
    private String address;
    private String postcode;
    private String cuisine;
    private int imageResourceId;

    private float rating;
    private int noOfReviews;

    public Restaurant(String _name, String _address, String _cuisine, int _image) {
        name = _name;
        address = _address;
        cuisine = _cuisine;
        imageResourceId = _image;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCuisine() {
        return cuisine;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
