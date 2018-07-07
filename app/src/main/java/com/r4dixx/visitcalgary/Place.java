package com.r4dixx.visitcalgary;

import android.graphics.drawable.Drawable;

/**
 * {@link Place} represents a Calgary place summary that the user wants to learn more about.
 * It contains a descriptive image, a title and a short description for each place
 */

public class Place {

    private String mPlaceTitle;
    private String mPlaceDescription;
    private Drawable mImageResource;

    public Place(String placeTitle, String placeDescription, Drawable imageResource) {
        mPlaceTitle = placeTitle;
        mPlaceDescription = placeDescription;
        mImageResource = imageResource;
    }

    public String getPlaceTitle() {
        return mPlaceTitle;
    }

    public String getPlaceDesc() {
        return mPlaceDescription;
    }

    public Drawable getImageResource() {
        return mImageResource;
    }
}