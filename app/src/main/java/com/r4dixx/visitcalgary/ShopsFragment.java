package com.r4dixx.visitcalgary;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ShopsFragment extends Fragment {

    public ShopsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.card_title_shop_17thAve), getString(R.string.card_desc_shop_17thAve), R.drawable.shop_17thave));
        places.add(new Place(getString(R.string.card_title_shop_4thSt), getString(R.string.card_desc_shop_4thSt), R.drawable.shop_4thst));
        places.add(new Place(getString(R.string.card_title_shop_Boot), getString(R.string.card_desc_shop_Boot), R.drawable.shop_boot));
        places.add(new Place(getString(R.string.card_title_shop_Bankers), getString(R.string.card_desc_shop_Bankers), R.drawable.shop_bankers));
        places.add(new Place(getString(R.string.card_title_shop_BikeBike), getString(R.string.card_desc_shop_BikeBike), R.drawable.shop_bikebike));
        places.add(new Place(getString(R.string.card_title_shop_Blondie), getString(R.string.card_desc_shop_Blondie), R.drawable.shop_blondie));
        places.add(new Place(getString(R.string.card_title_shop_Bow), getString(R.string.card_desc_shop_Bow), R.drawable.shop_bow));
        places.add(new Place(getString(R.string.card_title_shop_Britannia), getString(R.string.card_desc_shop_Britannia), R.drawable.shop_britannia));
        places.add(new Place(getString(R.string.card_title_shop_Farmers), getString(R.string.card_desc_shop_Farmers), R.drawable.shop_farmers));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.places_list);
        listView.setAdapter(adapter);

        return rootView;

    }
}
