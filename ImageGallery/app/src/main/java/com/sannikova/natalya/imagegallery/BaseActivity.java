package com.sannikova.natalya.imagegallery;


import android.content.Intent;
import android.support.v4.app.FragmentActivity;

public class BaseActivity extends FragmentActivity{

    public void redirect(
            Class<? extends BaseActivity> redirectTo,
            int enterAnimation,
            int exitAnimation,
            boolean doFinish
    ) {
        Intent intent = new Intent(this, redirectTo);

        startActivity(intent);
        overridePendingTransition(enterAnimation, exitAnimation);

        if(doFinish) {
            finish();
        }
    }
}
