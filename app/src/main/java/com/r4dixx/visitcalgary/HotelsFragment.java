package com.r4dixx.visitcalgary;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.card_title_hotel_Acclaim), getString(R.string.card_desc_hotel_Acclaim), R.drawable.hotel_acclaim));
        places.add(new Place(getString(R.string.card_title_hotel_Aloft), getString(R.string.card_desc_hotel_Aloft), R.drawable.hotel_aloft));
        places.add(new Place(getString(R.string.card_title_hotel_BWAirport), getString(R.string.card_desc_hotel_BWAirport), R.drawable.hotel_bwairport));
        places.add(new Place(getString(R.string.card_title_hotel_BWPark), getString(R.string.card_desc_hotel_BWPark), R.drawable.hotel_bwpark));
        places.add(new Place(getString(R.string.card_title_hotel_MarAirport), getString(R.string.card_desc_hotel_MarAirport), R.drawable.hotel_marairport));
        places.add(new Place(getString(R.string.card_title_hotel_MarDowntown), getString(R.string.card_desc_hotel_MarDowntown), R.drawable.hotel_mardowntown));
        places.add(new Place(getString(R.string.card_title_hotel_Candlewood), getString(R.string.card_desc_hotel_Candlewood), R.drawable.hotel_candlewood));
        places.add(new Place(getString(R.string.card_title_hotel_Carriage), getString(R.string.card_desc_hotel_Carriage), R.drawable.hotel_carriage));
        places.add(new Place(getString(R.string.card_title_hotel_Clarion), getString(R.string.card_desc_hotel_Clarion), R.drawable.hotel_clarion));
        places.add(new Place(getString(R.string.card_title_hotel_CoastPlaza), getString(R.string.card_desc_hotel_CoastPlaza), R.drawable.hotel_coastplaza));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.places_list);
        listView.setAdapter(adapter);

        return rootView;

    }
}
