package com.example.mymotionlayout.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import com.example.mymotionlayout.R;

public class ParallaxView extends RelativeLayout {
    public ParallaxView(Context context) {
        super(context);
        init(context);
    }

    public ParallaxView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.view_parallax, this, true);
    }
}
