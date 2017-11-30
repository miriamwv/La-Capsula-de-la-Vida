package com.example.allisonreiss.hark;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by veronica.lin1218 on 11/29/2017.
 */

public class FinishedReminderScreen extends AppCompatActivity {
    private TextView reminderTitle, time;
    private Button confirmBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finished_reminder);
        reminderTitle = (TextView) findViewById(R.id.reminderTitle);
        time = (TextView) findViewById(R.id.time);
        confirmBtn = (Button) findViewById(R.id.confirmBtn);
        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FinishedReminderScreen.this, HomeScreen.class));
            }
        });
    }
}
