package com.r4dixx.visitcalgary;


import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;

public class ArtsFragment extends Fragment {
    @BindString(R.string.card_title_art_Ballet) String balletTitle;
    @BindString(R.string.card_desc_art_Ballet)  String balletDesc;
    @BindString(R.string.card_title_art_College) String collegeTitle;
    @BindString(R.string.card_desc_art_College) String collegeDesc;
    @BindString(R.string.card_title_art_Gallery) String galleryTitle;
    @BindString(R.string.card_desc_art_Gallery) String galleryDesc;
    @BindString(R.string.card_title_art_Dancesport) String danceTitle;
    @BindString(R.string.card_desc_art_Dancesport)  String danceDesc;
    @BindString(R.string.card_title_art_Theatre) String theaterTitle;
    @BindString(R.string.card_desc_art_Theatre) String theaterDesc;
    @BindString(R.string.card_title_art_Commons) String commonsTitle;
    @BindString(R.string.card_desc_art_Commons) String commonsDesc;
    @BindString(R.string.card_title_art_Amphitheatre) String amphitheaterTitle;
    @BindString(R.string.card_desc_art_Amphitheatre) String amphitheaterDesc;
    @BindString(R.string.card_title_art_Church) String churchTitle;
    @BindString(R.string.card_desc_art_Church) String churchDesc;

    @BindDrawable(R.drawable.art_ballet) int balletDraw;
    @BindDrawable(R.drawable.art_college) int collegeDraw;
    @BindDrawable(R.drawable.art_dancesport) int danceDraw;
    @BindDrawable(R.drawable.art_amphitheatre) int amphiDraw;
    @BindDrawable(R.drawable.art_church) int churchDraw;
    @BindDrawable(R.drawable.art_commons) int commonDraw;
    @BindDrawable(R.drawable.art_gallery) int galleryDraw;
    @BindDrawable(R.drawable.art_theatre) int theaterDraw;

    @BindView(R.id.places_list) ListView listView;

    public ArtsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.places_list, container, false);
        ButterKnife.bind(this,rootView);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(balletTitle, balletDesc, balletDraw));
        places.add(new Place(collegeTitle, collegeDesc, collegeDraw));
        places.add(new Place(galleryTitle, galleryDesc, galleryDraw));
        places.add(new Place(danceTitle, danceDesc, danceDraw));
        places.add(new Place(theaterTitle, theaterDesc, theaterDraw));
        places.add(new Place(commonsTitle, commonsDesc, commonDraw));
        places.add(new Place(churchTitle, churchDesc, churchDraw));
        places.add(new Place(amphitheaterTitle, amphitheaterDesc, amphiDraw));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        listView.setAdapter(adapter);

        return rootView;

    }
}
