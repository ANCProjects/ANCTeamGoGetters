package com.musicapp.android.allure.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.musicapp.android.allure.fragments.Artists;
import com.musicapp.android.allure.fragments.Folders;
import com.musicapp.android.allure.fragments.Songs;


public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private int tabCount;

    public ViewPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Songs();
            case 1:
                return new Artists();
            case 2:
                return new Folders();
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:
                return "Songs";
            case 1:
                return "Artists";
            case 2:
                return "Folders";
        }
        return null;
    }

    @Override
    public int getCount() {

        return this.tabCount;
    }
}
