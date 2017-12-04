package com.example.allisonreiss.hark;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Activity to create new Reminder Form
 */
public class ReminderActivity extends AppCompatActivity {
   private ViewPager pager;

    /**
     * Create passed in Bundle, initialize MyPageAdapter
     * @param savedInstanceState Bundle to create
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);


        MyPageAdapter pageAdapter =  new MyPageAdapter(getSupportFragmentManager());
        pager = (ViewPager)findViewById(R.id.myPager);
        pager.setAdapter(pageAdapter);

    }

    /**
     * Given a position, select fragment
     * @param position index of fragment
     */
    public void selectFragment(int position) {
        pager.setCurrentItem(position, true);
    }
}
