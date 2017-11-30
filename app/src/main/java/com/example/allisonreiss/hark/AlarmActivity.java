package com.example.allisonreiss.hark;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;


/**
 * Created by veronica.lin1218 on 11/28/2017.
 */

/**
 * Contains page to select alarm time
 */
public class AlarmActivity extends AppCompatActivity {
    private TimePicker timePicker;
    private AlarmManager alarmManager;
    private static AlarmActivity inst;
    private PendingIntent pendingIntent;
    private Button nextBtn, backBtn;
    private TextView alarmText;

    public static AlarmActivity instance() {
        return inst;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_reminders_screen);
        nextBtn = (Button)findViewById(R.id.nextTimeBtn);
        backBtn = (Button)findViewById(R.id.backBtn);
        timePicker = (TimePicker) findViewById(R.id.timePicker);
        alarmText = (TextView) findViewById(R.id.alarmText);
        alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        nextBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            /**
             * When nextBtn is clicked, go to settings page
             */
            public void onClick(View v) {
                startActivity(new Intent(AlarmActivity.this, reminderSettingsScreen.class));

                // set alarm to start at inputted time
                Calendar calendar = Calendar.getInstance();
                calendar.set(Calendar.HOUR_OF_DAY, timePicker.getCurrentHour());
                calendar.set(Calendar.MINUTE, timePicker.getCurrentMinute());

                Intent myIntent = new Intent(AlarmActivity.this, AlarmReceiver.class);
                pendingIntent = PendingIntent.getBroadcast(AlarmActivity.this, 0, myIntent, 0);
                alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), AlarmManager.INTERVAL_DAY,
                        pendingIntent);

                int hour = timePicker.getCurrentHour();
                int minute = timePicker.getCurrentMinute();
                setAlarmText(hour + ":" + minute);
            }});
        /**
         * Go back to home page
         */
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
    public void setAlarmText(String text) {
        alarmText.setText(text);
    }
}
