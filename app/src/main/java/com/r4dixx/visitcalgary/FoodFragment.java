package com.r4dixx.visitcalgary;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.card_title_food_Alforno), getString(R.string.card_desc_food_Alforno), R.drawable.food_alforno));
        places.add(new Place(getString(R.string.card_title_food_Anju), getString(R.string.card_desc_food_Anju), R.drawable.food_anju));
        places.add(new Place(getString(R.string.card_title_food_Annex), getString(R.string.card_desc_food_Annex), R.drawable.food_annex));
        places.add(new Place(getString(R.string.card_title_food_Atrium), getString(R.string.card_desc_food_Atrium), R.drawable.food_atrium));
        places.add(new Place(getString(R.string.card_title_food_Anejo), getString(R.string.card_desc_food_Anejo), R.drawable.food_anejo));
        places.add(new Place(getString(R.string.card_title_food_Banded), getString(R.string.card_desc_food_Banded), R.drawable.food_banded));
        places.add(new Place(getString(R.string.card_title_food_Bank), getString(R.string.card_desc_food_Bank), R.drawable.food_bank));
        places.add(new Place(getString(R.string.card_title_food_Bavarian), getString(R.string.card_desc_food_Bavarian), R.drawable.food_bavarian));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.places_list);
        listView.setAdapter(adapter);

        return rootView;

    }
}
