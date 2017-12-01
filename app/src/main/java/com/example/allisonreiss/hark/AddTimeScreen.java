package com.example.allisonreiss.hark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;


/**
 * Created by veronica.lin1218 on 11/28/2017.
 */

/**
 * Contains page to select alarm time
 */
public class AddTimeScreen extends AppCompatActivity {
    public static AppCompatActivity activity;
    private TimePicker timePicker;
    private Button nextBtn, backBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = this;
        setContentView(R.layout.activity_add_time);
        nextBtn = (Button)findViewById(R.id.nextTimeBtn);
        timePicker = (TimePicker) findViewById(R.id.timePicker);
        backBtn = (Button) findViewById(R.id.backBtn);

        nextBtn.setOnClickListener(new View.OnClickListener()
        {

            @Override
            /**
             * When nextBtn is clicked, go to settings page
             */
            public void onClick (View v){
                startActivity(new Intent(AddTimeScreen.this, reminderSettingsScreen.class));
            }
        });
        backBtn.setOnClickListener(new View.OnClickListener()
        {

            @Override
            /**
             * When nextBtn is clicked, go to settings page
             */
            public void onClick (View v){
                onBackPressed();
            }
        });

    }
}
