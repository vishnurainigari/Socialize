package com.vishnurainigari.socialize.ViewPagerActivities;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vishnurainigari.socialize.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SettingScreen extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_setting_screen, container, false);
    }

    public static SettingScreen newInstance()
    {
        SettingScreen settingScreen = new SettingScreen();

        return settingScreen;
    }


}
