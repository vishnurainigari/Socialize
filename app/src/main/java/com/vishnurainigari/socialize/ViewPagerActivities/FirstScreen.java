package com.vishnurainigari.socialize.ViewPagerActivities;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.vishnurainigari.socialize.R;


public class FirstScreen extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_first_screen, container, false);

        TextView textView = (TextView) v.findViewById(R.id.firstFragmentview);

        textView.setText("first fragment called");

        return v;
    }

    public static FirstScreen newInstance()
    {
        FirstScreen firstScreen = new FirstScreen();

        return firstScreen;
    }

}
