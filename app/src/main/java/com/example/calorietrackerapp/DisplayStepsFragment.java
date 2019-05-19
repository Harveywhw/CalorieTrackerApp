package com.example.calorietrackerapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DisplayStepsFragment extends Fragment {
    View vSteps;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        vSteps = inflater.inflate(R.layout.fragment_display_steps, container, false);
        return vSteps;
    }
}
