package com.iamrajendra.wedding;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    private long delay=3000;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        init();
        configToolbar();

        initSession();
    }

    private void init() {
    mContext =  getApplicationContext();
    }

    private void initSession() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
               callMainActivity();
            }
        },delay);
    }

    private void callMainActivity() {
    Intent intent  = new Intent(mContext,MainActivity.class);
    startActivity(intent);
        finish();
    }

    private void configToolbar() {

    }
}
