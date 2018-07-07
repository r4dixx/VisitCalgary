package com.r4dixx.visitcalgary;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PlaceAdapter extends ArrayAdapter<Place> {

    @BindView(R.id.card_title)
    TextView cardTitle;
    @BindView(R.id.card_desc)
    TextView cardDesc;
    @BindView(R.id.card_image)
    ImageView cardImage;

    public PlaceAdapter(Activity context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        ButterKnife.bind(this, listItemView);

        Place currentPlace = getItem(position);

        cardTitle.setText(currentPlace.getPlaceTitle());
        cardDesc.setText(currentPlace.getPlaceDesc());
        cardImage.setImageDrawable(currentPlace.getImageResource());

        return listItemView;
    }
}