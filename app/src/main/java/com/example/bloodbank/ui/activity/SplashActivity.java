package com.example.bloodbank.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.bloodbank.R;

public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(
                new Runnable() {

                    @Override

                    public void run() {

                        Intent i = new Intent(SplashActivity.this, SliderActivity.class);
                        startActivity(i);

                        // close this activity
                        finish();

                    }

                },

                SPLASH_TIME_OUT

        );
    }

}