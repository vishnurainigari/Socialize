package com.vishnurainigari.socialize.ViewPagerActivities;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.vishnurainigari.socialize.R;


public class ThirdScreen extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_third_screen, container, false);

        TextView textView = (TextView) v.findViewById(R.id.thirdScreen);
        textView.setText("Third fragment called");

        return v;
    }

    public static ThirdScreen newInstance(){

        ThirdScreen thirdScreen = new ThirdScreen();

        return thirdScreen;
    }


}
