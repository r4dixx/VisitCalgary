package com.r4dixx.visitcalgary;

/**
 * {@link Place} represents a Calgary place summary that the user wants to learn more about.
 * It contains a descriptive image, a title and a short description for each place
 */

public class Place {

    private String mPlaceTitle;
    private String mPlaceDescription;
    private int mImageResourceId;

    public Place(String placeTitle, String placeDescription, int imageResourceId) {
        mPlaceTitle = placeTitle;
        mPlaceDescription = placeDescription;
        mImageResourceId = imageResourceId;
    }

    public String getPlaceTitle() {
        return mPlaceTitle;
    }

    public String getPlaceDesc() {
        return mPlaceDescription;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}