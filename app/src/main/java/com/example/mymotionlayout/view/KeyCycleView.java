package com.example.mymotionlayout.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import com.example.mymotionlayout.R;

public class KeyCycleView extends RelativeLayout {
    public KeyCycleView(Context context) {
        super(context);
        init(context);
    }

    public KeyCycleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.view_key_cycle, this, true);
    }
}
