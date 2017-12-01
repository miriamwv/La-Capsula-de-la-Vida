package com.example.allisonreiss.hark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * Created by veronica.lin1218 on 11/28/2017.
 */

public class reminderSettingsScreen extends AppCompatActivity {
    private NumberPicker numPicker;
    private TextView dosage, txtOften;
    private Button nextBtn, backBtn;
    private RadioButton dailyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reminder_settings_screen);
        numPicker = (NumberPicker) findViewById(R.id.numberPicker);
        numPicker.setMinValue(1);
        numPicker.setMaxValue(50);
        dosage = (TextView) findViewById(R.id.txtDosage);
        nextBtn = (Button) findViewById(R.id.nextBtn);
        nextBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v) {
                AddTimeScreen.activity.finish();
                newMedScreen.activity.finish();
                finish();
            }
        });
        backBtn = (Button) findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                onBackPressed();
            }
        });
        dailyBtn = (RadioButton) findViewById(R.id.dailyBtn);
    }
}
