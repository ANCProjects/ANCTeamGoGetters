package com.musicapp.android.allure.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.musicapp.android.allure.R;


public class Folders extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View foldersLayout = inflater.inflate(R.layout.folders, container, false);
        return foldersLayout;
    }

}
