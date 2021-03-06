package com.sannikova.natalya.imagegallery.views;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.sannikova.natalya.imagegallery.R;

import org.androidannotations.annotations.EViewGroup;

@EViewGroup(R.layout.view_header)
public class HeaderView extends LinearLayout {

    public HeaderView(Context context) {
        super(context);
    }

    public HeaderView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
}
