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

public class ShopsFragment extends Fragment {

    public ShopsFragment() {
        // Required empty public constructor
    }

    @BindString(R.string.card_title_shop_17thAve)
    String seventhaveTitle;
    @BindString(R.string.card_desc_shop_17thAve)
    String seventhaveDesc;
    @BindString(R.string.card_title_shop_4thSt)
    String fourthstTitle;
    @BindString(R.string.card_desc_shop_4thSt)
    String fourthstDesc;
    @BindString(R.string.card_title_shop_Boot)
    String bootTitle;
    @BindString(R.string.card_desc_shop_Boot)
    String bootDesc;
    @BindString(R.string.card_title_shop_Bankers)
    String bankersTitle;
    @BindString(R.string.card_desc_shop_Bankers)
    String bankersDesc;
    @BindString(R.string.card_title_shop_BikeBike)
    String bikebikeTitle;
    @BindString(R.string.card_desc_shop_BikeBike)
    String bikebikeDesc;
    @BindString(R.string.card_title_shop_Blondie)
    String blondieTitle;
    @BindString(R.string.card_desc_shop_Blondie)
    String blondieDesc;
    @BindString(R.string.card_title_shop_Bow)
    String bowTitle;
    @BindString(R.string.card_desc_shop_Bow)
    String bowDesc;
    @BindString(R.string.card_title_shop_Britannia)
    String britanniaTitle;
    @BindString(R.string.card_desc_shop_Britannia)
    String britanniaDesc;
    @BindString(R.string.card_title_shop_Farmers)
    String farmersTitle;
    @BindString(R.string.card_desc_shop_Farmers)
    String farmersDesc;

    @BindDrawable(R.drawable.shop_17thave)
    Drawable seventhaveDraw;
    @BindDrawable(R.drawable.shop_4thst)
    Drawable fourthstDraw;
    @BindDrawable(R.drawable.shop_boot)
    Drawable bootDraw;
    @BindDrawable(R.drawable.shop_bankers)
    Drawable bankersDraw;
    @BindDrawable(R.drawable.shop_bikebike)
    Drawable bikebikeDraw;
    @BindDrawable(R.drawable.shop_blondie)
    Drawable blondieDraw;
    @BindDrawable(R.drawable.shop_bow)
    Drawable bowDraw;
    @BindDrawable(R.drawable.shop_britannia)
    Drawable britanniaDraw;
    @BindDrawable(R.drawable.shop_farmers)
    Drawable farmersDraw;

    @BindView(R.id.places_list)
    ListView listView;

    private Unbinder unbinder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.places_list, container, false);
        ButterKnife.bind(this, rootView);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(seventhaveTitle, seventhaveDesc, seventhaveDraw));
        places.add(new Place(fourthstTitle, fourthstDesc, fourthstDraw));
        places.add(new Place(bootTitle, bootDesc, bootDraw));
        places.add(new Place(bankersTitle, bankersDesc, bankersDraw));
        places.add(new Place(bikebikeTitle, bikebikeDesc, bikebikeDraw));
        places.add(new Place(blondieTitle, blondieDesc, blondieDraw));
        places.add(new Place(bowTitle, bowDesc, bowDraw));
        places.add(new Place(britanniaTitle, britanniaDesc, britanniaDraw));
        places.add(new Place(farmersTitle, farmersDesc, farmersDraw));

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
