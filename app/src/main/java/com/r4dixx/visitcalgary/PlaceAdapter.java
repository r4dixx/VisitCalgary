package com.r4dixx.visitcalgary;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Activity context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Place currentPlace = getItem(position);

        TextView TitleTextView = listItemView.findViewById(R.id.card_title);
        TitleTextView.setText(currentPlace.getPlaceTitle());

        TextView DescTextView = listItemView.findViewById(R.id.card_subtitle);
        DescTextView.setText(currentPlace.getPlaceDesc());

        ImageView imageView = listItemView.findViewById((R.id.card_image));
        imageView.setImageResource(currentPlace.getImageResourceId());

        return listItemView;
    }
}