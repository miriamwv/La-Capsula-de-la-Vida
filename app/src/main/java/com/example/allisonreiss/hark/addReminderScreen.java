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
public class addReminderScreen extends AppCompatActivity {
    private TimePicker timePicker;
    private Button nextBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_reminders_screen);
        nextBtn = (Button)findViewById(R.id.nextTimeBtn);
        timePicker = (TimePicker) findViewById(R.id.timePicker);

        nextBtn.setOnClickListener(new View.OnClickListener()
        {

            @Override
            /**
             * When nextBtn is clicked, go to settings page
             */
            public void onClick (View v){
                startActivity(new Intent(addReminderScreen.this, reminderSettingsScreen.class));
            }
        });
    }
}
