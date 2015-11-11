package com.vishnurainigari.socialize;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.vishnurainigari.socialize.ViewPagerActivities.FirstScreen;
import com.vishnurainigari.socialize.ViewPagerActivities.SecondScreen;
import com.vishnurainigari.socialize.ViewPagerActivities.ThirdScreen;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(new PagerViewAdapter(getSupportFragmentManager()));
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
                    return FirstScreen.newInstance();
                case 1:
                    return ThirdScreen.newInstance();
                default :
                    return SecondScreen.newInstance();
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }

}
