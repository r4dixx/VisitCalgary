package com.r4dixx.visitcalgary;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ArtsFragment();
            case 1:
                return new ShopsFragment();
            case 2:
                return new FoodFragment();
            case 3:
                return new HotelsFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.category_arts);
            case 1:
                return mContext.getString(R.string.category_shops);
            case 2:
                return mContext.getString(R.string.category_food);
            case 3:
                return mContext.getString(R.string.category_hotels);
            default:
                return null;
        }
    }
}