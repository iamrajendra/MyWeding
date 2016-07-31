package com.iamrajendra.wedding;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    private long delay=3000;
    private Context mContext;
    private FrameLayout mFrameLayout_kenseffect;
    private LinearLayout mLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        init();
        configToolbar();

        logoAnimation();
        kensEffect();

    }
    private void configToolbar() {
        View decorView = getWindow().getDecorView();
// Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
// Remember that you should never show the action bar if the
// status bar is hidden, so hide that too if necessary.

    }
    private void logoAnimation() {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.elasticanimtion);
        mLinearLayout.setAnimation(animation);
    }

    private void kensEffect() {
        mFrameLayout_kenseffect.getBackground().setAlpha(156);
    }

    private void init() {
        mLinearLayout = (LinearLayout)findViewById(R.id.splash_activity_logo_ll);
        mFrameLayout_kenseffect = (FrameLayout) findViewById(R.id.activity_splah_kens_fl);
    }

}
