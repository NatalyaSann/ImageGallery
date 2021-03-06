package com.sannikova.natalya.imagegallery;

import android.os.Bundle;

import com.sannikova.natalya.imagegallery.views.NavigationTopView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_feed)
public class FeedActivity extends BaseActivity {

    @ViewById(R.id.top)
    NavigationTopView navigationTopView;


    @AfterViews
    public void init() {
        navigationTopView.setPage(NavigationTopView.Page.FEED);
    }
}
