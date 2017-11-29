package com.example.allisonreiss.hark;

import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {
    private Button streak, health, schedule;
    private BottomNavigationView nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        streak = (Button) findViewById(R.id.button);
        health = (Button) findViewById(R.id.button2);
        schedule = (Button) findViewById(R.id.button3);
        nav = (BottomNavigationView) findViewById(R.id.bottom_navigation);

    }


}
