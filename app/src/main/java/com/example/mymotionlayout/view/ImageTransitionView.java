package com.example.mymotionlayout.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import com.example.mymotionlayout.R;

public class ImageTransitionView extends RelativeLayout {
    public ImageTransitionView(Context context) {
        super(context);
        init(context);
    }

    public ImageTransitionView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.view_image_transition, this, true);
    }
}
