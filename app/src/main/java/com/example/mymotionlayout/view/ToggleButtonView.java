package com.example.mymotionlayout.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import com.example.mymotionlayout.R;

public class ToggleButtonView extends RelativeLayout {
    public ToggleButtonView(Context context) {
        super(context);
        init(context);
    }

    public ToggleButtonView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.view_toggle, this, true);
    }
}
