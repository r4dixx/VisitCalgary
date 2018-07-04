package com.r4dixx.visitcalgary;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtsFragment extends Fragment {

    public ArtsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.card_title_art_Ballet), getString(R.string.card_desc_art_Ballet), R.drawable.art_ballet));
        places.add(new Place(getString(R.string.card_title_art_College), getString(R.string.card_desc_art_College), R.drawable.art_college));
        places.add(new Place(getString(R.string.card_title_art_Gallery), getString(R.string.card_desc_art_Gallery), R.drawable.art_gallery));
        places.add(new Place(getString(R.string.card_title_art_Dancesport), getString(R.string.card_desc_art_Dancesport), R.drawable.art_dancesport));
        places.add(new Place(getString(R.string.card_title_art_Theatre), getString(R.string.card_desc_art_Theatre), R.drawable.art_theatre));
        places.add(new Place(getString(R.string.card_title_art_Commons), getString(R.string.card_desc_art_Commons), R.drawable.art_commons));
        places.add(new Place(getString(R.string.card_title_art_Church), getString(R.string.card_desc_art_Church), R.drawable.art_church));
        places.add(new Place(getString(R.string.card_title_art_Amphitheatre), getString(R.string.card_desc_art_Amphitheatre), R.drawable.art_amphitheatre));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.places_list);
        listView.setAdapter(adapter);

        return rootView;

    }
}
