package com.example.mymotionlayout.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.constraintlayout.motion.widget.MotionLayout;

import com.example.mymotionlayout.R;
import com.google.android.material.appbar.AppBarLayout;

public class CoordinatorLayoutView extends RelativeLayout {
    public CoordinatorLayoutView(Context context) {
        super(context);
        init(context);
    }

    public CoordinatorLayoutView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        View view = LayoutInflater.from(context).inflate(R.layout.view_coordinator, this, true);
        AppBarLayout abl = view.findViewById(R.id.abl);
        MotionLayout mlHeader = view.findViewById(R.id.ml_header);

        abl.addOnOffsetChangedListener((appBarLayout, verticalOffset) ->
                mlHeader.setProgress((float) -verticalOffset / appBarLayout.getTotalScrollRange()));
    }
}
