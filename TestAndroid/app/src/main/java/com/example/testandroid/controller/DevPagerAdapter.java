package com.example.testandroid.controller;

import android.app.ActivityManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.SupportActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.example.testandroid.view.DrinksFragment;
import com.example.testandroid.view.FoodFragment;
import com.example.testandroid.view.MerchandiseFragment;
public class DevPagerAdapter extends FragmentPagerAdapter {

    public DevPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0: return new DrinksFragment();
            case 1:return new FoodFragment();
            case 2: return new MerchandiseFragment();
        }
        return null;
    }
    @Override
    public int getCount() {
        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "DRINK";
            case 1: return "FOOD";
            case 2: return "MERCHANDISE";
        }
        return null;
    }
}
