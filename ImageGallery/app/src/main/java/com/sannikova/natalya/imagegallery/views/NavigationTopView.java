package com.sannikova.natalya.imagegallery.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.sannikova.natalya.imagegallery.BaseActivity;
import com.sannikova.natalya.imagegallery.FeedActivity;
import com.sannikova.natalya.imagegallery.FeedActivity_;
import com.sannikova.natalya.imagegallery.FilesActivity;
import com.sannikova.natalya.imagegallery.FilesActivity_;
import com.sannikova.natalya.imagegallery.OfflineActivity;
import com.sannikova.natalya.imagegallery.OfflineActivity_;
import com.sannikova.natalya.imagegallery.PhotosActivity;
import com.sannikova.natalya.imagegallery.PhotosActivity_;
import com.sannikova.natalya.imagegallery.R;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

@EViewGroup(R.layout.view_navigation_top)
public class NavigationTopView extends RelativeLayout{

    public enum Page {
        FEED, FILES, PHOTOS, OFFLINE
    }

    @ViewById(R.id.text_feed)
    TextView feedTextView;
    @ViewById(R.id.text_files)
    TextView filesTextView;
    @ViewById(R.id.text_photos)
    TextView photosTextView;
    @ViewById(R.id.text_offline)
    TextView offlineTextView;

    public NavigationTopView(Context context) {
        super(context);
    }

    public NavigationTopView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    //functions for "buttons"
    @Click(R.id.feed)
    void onFeedClick() {
        ((BaseActivity) getContext()).redirect(FeedActivity_.class, 0, 0, true);
    }

    @Click(R.id.files)
    void onFilesClick() {
        ((BaseActivity) getContext()).redirect(FilesActivity_.class, 0, 0, true);
    }

    @Click(R.id.photos)
    void onPhotosClick() {
        ((BaseActivity) getContext()).redirect(PhotosActivity_.class, 0, 0, true);
    }

    @Click(R.id.offline)
    void onOfflineClick() {
        ((BaseActivity) getContext()).redirect(OfflineActivity_.class, 0, 0, true);
    }


    public void setPage(Page page) {
        switch (page) {
            case FEED:
                setPage(feedTextView);
                break;
            case FILES:
                setPage(filesTextView);
                break;
            case PHOTOS:
                setPage(photosTextView);
                break;
            case OFFLINE:
                setPage(offlineTextView);
                break;
        }
    }

    //set color on chosen page
    private void setPage(TextView currentTextView) {
        feedTextView.setTextColor(getResources().getColor(R.color.gray));
        filesTextView.setTextColor(getResources().getColor(R.color.gray));
        photosTextView.setTextColor(getResources().getColor(R.color.gray));
        offlineTextView.setTextColor(getResources().getColor(R.color.gray));

        currentTextView.setTextColor(getResources().getColor(R.color.mainColor));

    }



}
