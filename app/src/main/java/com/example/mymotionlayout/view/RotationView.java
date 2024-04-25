package com.example.mymotionlayout.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.mymotionlayout.R;

public class RotationView extends RelativeLayout {
    public RotationView(@NonNull Context context) {
        super(context);
        init(context);
    }

    public RotationView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.view_rotation, this, true);
    }
}
