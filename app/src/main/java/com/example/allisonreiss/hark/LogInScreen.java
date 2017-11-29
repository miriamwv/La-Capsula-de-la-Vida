package com.example.allisonreiss.hark;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class LogInScreen extends AppCompatActivity {
    private Button loginBtn;
    private EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_screen);

        loginBtn = (Button) findViewById(R.id.loginBtn);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        loginBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                startActivity(new Intent(LogInScreen.this, newMedScreen.class));
            }
        });
    }
}