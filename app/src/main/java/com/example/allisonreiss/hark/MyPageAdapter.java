package com.example.allisonreiss.hark;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Create PageAdapter, allowing the traversing of Fragments for the Reminder form
 */

public class MyPageAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragments;

    /**
     * Create new MyPageAdapter
     * @param fm FragmentManager to manage fragments
     */
    public MyPageAdapter(FragmentManager fm) {
        super(fm);
        this.fragments = new ArrayList<Fragment>();
        fragments.add(AddMedicine.newInstance()); // 0
        fragments.add(PickTimeFragment.newInstance()); // 1
        fragments.add(CompletedReminderFragment.newInstance()); // 2
    }

    /**
     * Return corresponding fragment when given an index
     * @param position index to find Fragment
     * @return Fragment
     */
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    /**
     * Return number of fragments
     * @return int number of fragments
     */
    @Override
    public int getCount() {
        return fragments.size();
    }

}
