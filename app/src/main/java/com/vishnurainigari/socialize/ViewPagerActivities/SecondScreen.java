package com.vishnurainigari.socialize.ViewPagerActivities;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.vishnurainigari.socialize.R;

public class SecondScreen extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_second_screen, container, false);

        TextView textView = (TextView) v.findViewById(R.id.secondScreenView);
        textView.setText("Second screen called");

        return v;
    }

    public static SecondScreen newInstance()
    {
        SecondScreen secondScreen = new SecondScreen();

        return secondScreen;
    }

}
