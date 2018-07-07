package com.r4dixx.visitcalgary;


import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @BindString(R.string.card_title_hotel_Acclaim)
    String acclaimTitle;
    @BindString(R.string.card_desc_hotel_Acclaim)
    String acclaimDesc;
    @BindString(R.string.card_title_hotel_Aloft)
    String aloftTitle;
    @BindString(R.string.card_desc_hotel_Aloft)
    String aloftDesc;
    @BindString(R.string.card_title_hotel_BWAirport)
    String bwairportTitle;
    @BindString(R.string.card_desc_hotel_BWAirport)
    String bwairportDesc;
    @BindString(R.string.card_title_hotel_BWPark)
    String bwparkTitle;
    @BindString(R.string.card_desc_hotel_BWPark)
    String bwparkDesc;
    @BindString(R.string.card_title_hotel_MarAirport)
    String marairportTitle;
    @BindString(R.string.card_desc_hotel_MarAirport)
    String marairportDesc;
    @BindString(R.string.card_title_hotel_MarDowntown)
    String mardowntownTitle;
    @BindString(R.string.card_desc_hotel_MarDowntown)
    String mardowntownDesc;
    @BindString(R.string.card_title_hotel_Candlewood)
    String candlewoodTitle;
    @BindString(R.string.card_desc_hotel_Candlewood)
    String candlewoodDesc;
    @BindString(R.string.card_title_hotel_Carriage)
    String carriageTitle;
    @BindString(R.string.card_desc_hotel_Carriage)
    String carriageDesc;
    @BindString(R.string.card_title_hotel_Clarion)
    String clarionTitle;
    @BindString(R.string.card_desc_hotel_Clarion)
    String clarionDesc;
    @BindString(R.string.card_title_hotel_CoastPlaza)
    String coastTitle;
    @BindString(R.string.card_desc_hotel_CoastPlaza)
    String coastDesc;

    @BindDrawable(R.drawable.hotel_acclaim)
    Drawable acclaimDraw;
    @BindDrawable(R.drawable.hotel_aloft)
    Drawable aloftDraw;
    @BindDrawable(R.drawable.hotel_bwairport)
    Drawable bwairportDraw;
    @BindDrawable(R.drawable.hotel_bwpark)
    Drawable bwparkDraw;
    @BindDrawable(R.drawable.hotel_marairport)
    Drawable marairportDraw;
    @BindDrawable(R.drawable.hotel_mardowntown)
    Drawable mardowntownDraw;
    @BindDrawable(R.drawable.hotel_candlewood)
    Drawable candlewoodDraw;
    @BindDrawable(R.drawable.hotel_carriage)
    Drawable carriageDraw;
    @BindDrawable(R.drawable.hotel_clarion)
    Drawable clarionDraw;
    @BindDrawable(R.drawable.hotel_coastplaza)
    Drawable coastDraw;

    @BindView(R.id.places_list)
    ListView listView;

    private Unbinder unbinder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.places_list, container, false);
        ButterKnife.bind(this, rootView);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(acclaimTitle, acclaimDesc, acclaimDraw));
        places.add(new Place(aloftTitle, aloftDesc, aloftDraw));
        places.add(new Place(bwairportTitle, bwairportDesc, bwairportDraw));
        places.add(new Place(bwparkTitle, bwparkDesc, bwparkDraw));
        places.add(new Place(marairportTitle, marairportDesc, marairportDraw));
        places.add(new Place(mardowntownTitle, mardowntownDesc, mardowntownDraw));
        places.add(new Place(candlewoodTitle, candlewoodDesc, candlewoodDraw));
        places.add(new Place(carriageTitle, carriageDesc, carriageDraw));
        places.add(new Place(clarionTitle, clarionDesc, clarionDraw));
        places.add(new Place(coastTitle, coastDesc, coastDraw));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        listView.setAdapter(adapter);

        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}