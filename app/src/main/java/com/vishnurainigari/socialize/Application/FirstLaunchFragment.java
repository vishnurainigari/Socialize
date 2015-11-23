package com.vishnurainigari.socialize.Application;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vishnurainigari.socialize.R;


public class FirstLaunchFragment extends Fragment {

    public static FirstLaunchFragment newInstance() {
        FirstLaunchFragment fragment = new FirstLaunchFragment();
        return fragment;
    }

    public FirstLaunchFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first_launch, container, false);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
