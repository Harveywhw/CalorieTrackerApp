package com.example.calorietrackerapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DisplayDailyDietFragment extends Fragment {
    View vDisplayDaily;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        vDisplayDaily = inflater.inflate(R.layout.fragment_display_daily_diet, container, false);
        return vDisplayDaily;
    }
}
