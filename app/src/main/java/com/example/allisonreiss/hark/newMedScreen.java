package com.example.allisonreiss.hark;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by veronica.lin1218 on 11/28/2017.
 */

public class newMedScreen extends AppCompatActivity {
    public static AppCompatActivity activity;
    private ImageView bar, pill;
    private Button nextBtn, cancelBtn;
    private EditText medName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = this;
        setContentView(R.layout.new_med_screen);
        // Create pill icon
        pill = (ImageView)findViewById(R.id.pill);

        // create input medicine text field
        medName = (EditText) findViewById(R.id.medicineName);

        // create next button
        nextBtn = (Button) findViewById(R.id.nextBtn);
        cancelBtn = (Button) findViewById(R.id.cancel);
        cancelBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                finish();
            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                finish();
                startActivity(new Intent(newMedScreen.this, AddTimeScreen.class));
            }
        });


    }
}
