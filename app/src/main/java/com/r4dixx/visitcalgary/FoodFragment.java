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
import butterknife.ButterKnife;

public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @BindString(R.string.card_title_food_Alforno)
    String alfornoTitle;
    @BindString(R.string.card_desc_food_Alforno)
    String alfornoDesc;
    @BindString(R.string.card_title_food_Anju)
    String anjuTitle;
    @BindString(R.string.card_desc_food_Anju)
    String anjuDesc;
    @BindString(R.string.card_title_food_Annex)
    String annexTitle;
    @BindString(R.string.card_desc_food_Annex)
    String annexDesc;
    @BindString(R.string.card_title_food_Atrium)
    String atriumTitle;
    @BindString(R.string.card_desc_food_Atrium)
    String atriumDesc;
    @BindString(R.string.card_title_food_Anejo)
    String anejoTitle;
    @BindString(R.string.card_desc_food_Anejo)
    String anejoDesc;
    @BindString(R.string.card_title_food_Banded)
    String bandedTitle;
    @BindString(R.string.card_desc_food_Banded)
    String bandedDesc;
    @BindString(R.string.card_title_food_Bank)
    String bankTitle;
    @BindString(R.string.card_desc_food_Bank)
    String bankDesc;
    @BindString(R.string.card_title_food_Bavarian)
    String bavarianTitle;
    @BindString(R.string.card_desc_food_Bavarian)
    String bavarianDesc;

    @BindDrawable(R.drawable.food_alforno)
    Drawable alfornoDraw;
    @BindDrawable(R.drawable.food_anju)
    Drawable anjuDraw;
    @BindDrawable(R.drawable.food_annex)
    Drawable annexDraw;
    @BindDrawable(R.drawable.food_atrium)
    Drawable atriumDraw;
    @BindDrawable(R.drawable.food_anejo)
    Drawable anejoDraw;
    @BindDrawable(R.drawable.food_banded)
    Drawable bandedDraw;
    @BindDrawable(R.drawable.food_bank)
    Drawable bankDraw;
    @BindDrawable(R.drawable.food_bavarian)
    Drawable bavarianDraw;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.places_list, container, false);
        ButterKnife.bind(this, rootView);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(alfornoTitle,alfornoDesc,alfornoDraw));
        places.add(new Place(anjuTitle,anjuDesc,anjuDraw));
        places.add(new Place(annexTitle,annexDesc,annexDraw));
        places.add(new Place(atriumTitle,atriumDesc,atriumDraw));
        places.add(new Place(anejoTitle,anejoDesc,anejoDraw));
        places.add(new Place(bandedTitle,bandedDesc,bandedDraw));
        places.add(new Place(bankTitle,bandedDesc,bankDraw));
        places.add(new Place(bavarianTitle,bavarianDesc,bavarianDraw));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.places_list);
        listView.setAdapter(adapter);

        return rootView;

    }
}
