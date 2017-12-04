package com.example.allisonreiss.hark;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class LogInScreen extends FragmentActivity {
    private Button loginBtn, createAccount;
    private EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_screen);

        loginBtn = (Button) findViewById(R.id.loginBtn);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        createAccount = (Button)findViewById(R.id.createAccount);
        loginBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){

                startActivity(new Intent(LogInScreen.this, HomeScreen.class));

            }
        });
        createAccount.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){

                Fragment frag = CreateAccountFragment.newInstance();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.constraintLayout, frag );
                transaction.addToBackStack(null);
                transaction.commit();

                //startActivity(new Intent(LogInScreen.this, CreateAccountFragment.class));
               /* FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayout5, CreateAccountFragment.newInstance());
                transaction.addToBackStack(null);
                transaction.commit();*/
            }
        });

    }
}