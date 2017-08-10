package com.welove.welove520.nestedviewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Raomengyang on 17-8-10.
 * Email    : ericrao@welove-inc.com
 * Desc     :
 * Version  : 1.0
 */

public class CustomPagerAdapter extends FragmentStatePagerAdapter {

    public static final String[] TITLES = {"PAGE1", "PAGE2", "PAGE3"};

    public CustomPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return TITLES.length;
    }

    @Override
    public Fragment getItem(int position) {
        return getFragmentByPosition(position);
    }

    private Fragment getFragmentByPosition(int position) {
        Bundle bundle = new Bundle();
        switch (position) {
            case 0:
                Fragment leftFragment = new LeftFragment();
                bundle.putString("titleName", TITLES[position]);
                leftFragment.setArguments(bundle);
                return leftFragment;
            case 2:
                Fragment rightFragment = new RightFragment();
                bundle.putString("titleName", TITLES[position]);
                rightFragment.setArguments(bundle);
                return rightFragment;
            default:
            case 1:
                Fragment pagerFragment = new PagerFragment();
                bundle.putString("titleName", TITLES[position]);
                pagerFragment.setArguments(bundle);
                return pagerFragment;
        }

    }

}
