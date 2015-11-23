package com.vishnurainigari.socialize;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;

import com.vishnurainigari.socialize.Application.FirstLaunchListActivity;
import com.vishnurainigari.socialize.ViewPagerActivities.FirstScreen;
import com.vishnurainigari.socialize.ViewPagerActivities.SecondScreen;
import com.vishnurainigari.socialize.ViewPagerActivities.SettingScreen;
import com.vishnurainigari.socialize.ViewPagerActivities.ThirdScreen;

public class MainActivity extends FragmentActivity implements View.OnClickListener{

    SharedPreferences preferences = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        preferences = getSharedPreferences("com.vishnurainigari.socialize", Context.MODE_PRIVATE);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(new PagerViewAdapter(getSupportFragmentManager()));
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(preferences.getBoolean("firstrun",true))
        {
            firstLaunchDialog();
            preferences.edit().putBoolean("firstrun",false).commit();
        }
    }

    private void firstLaunchDialog()
    {
       startActivity(new Intent(MainActivity.this, FirstLaunchListActivity.class));
    }

    @Override
    public void onClick(View v) {

    }


    private class PagerViewAdapter extends FragmentPagerAdapter{

        public PagerViewAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position)
            {
                case 0 :
                    return SecondScreen.newInstance();
                case 1:
                    return ThirdScreen.newInstance();
                case 2:
                    return SettingScreen.newInstance();
                default :
                    return FirstScreen.newInstance();
            }
        }

        @Override
        public int getCount() {
            return 4;
        }
    }

}
