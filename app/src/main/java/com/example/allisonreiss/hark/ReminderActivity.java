package com.example.allisonreiss.hark;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ReminderActivity extends AppCompatActivity {
   private ViewPager pager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);


        MyPageAdapter pageAdapter =  new MyPageAdapter(getSupportFragmentManager());
        pager = (ViewPager)findViewById(R.id.myPager);
        pager.setAdapter(pageAdapter);

    }
    public void selectFragment(int position) {
        pager.setCurrentItem(position, true);
    }
}
