package com.example.mymotionlayout.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import com.example.mymotionlayout.R;

public class KeyTimeCycleView extends RelativeLayout {
    public KeyTimeCycleView(Context context) {
        super(context);
        init(context);
    }

    public KeyTimeCycleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.view_key_time_cycle, this, true);
    }
}
