package com.example.allisonreiss.hark;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by veronica.lin1218 on 12/2/2017.
 */

public class MyPageAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragments;

    public MyPageAdapter(FragmentManager fm) {
        super(fm);
        this.fragments = new ArrayList<Fragment>();
        fragments.add(AddMedicine.newInstance()); // 0
        fragments.add(PickTimeFragment.newInstance()); // 1
        fragments.add(CompletedReminderFragment.newInstance()); // 2
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

}
