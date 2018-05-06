package com.sannikova.natalya.imagegallery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, FeedActivity_.class); //TODO FeedActivity_.class
        startActivity(intent);
        finish();
    }
}
