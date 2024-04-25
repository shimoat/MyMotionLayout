package com.example.mymotionlayout.aty;

import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mymotionlayout.R;
import com.example.mymotionlayout.adapter.AnimAdapter;
import com.example.mymotionlayout.base.BaseActivity;
import com.example.mymotionlayout.view.AlphaView;
import com.example.mymotionlayout.view.CoordinatorLayoutView;
import com.example.mymotionlayout.view.CustomColorView;
import com.example.mymotionlayout.view.DrawerLayoutView;
import com.example.mymotionlayout.view.FullScreenView;
import com.example.mymotionlayout.view.ImageTransitionView;
import com.example.mymotionlayout.view.KeyCycleView;
import com.example.mymotionlayout.view.KeyTimeCycleView;
import com.example.mymotionlayout.view.KeyframeInterpolationView;
import com.example.mymotionlayout.view.KeyframePositionView;
import com.example.mymotionlayout.view.MultiStateView;
import com.example.mymotionlayout.view.ParallaxView;
import com.example.mymotionlayout.view.Preview;
import com.example.mymotionlayout.view.RotationView;
import com.example.mymotionlayout.view.ScaleView;
import com.example.mymotionlayout.view.TestView;
import com.example.mymotionlayout.view.ToggleButtonView;
import com.example.mymotionlayout.view.TranslationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class AnimActivity extends BaseActivity {

    private RecyclerView mRv;
    private ConstraintLayout mClContainer;
    private FloatingActionButton mFabRemove;
    private FloatingActionButton mFabPreview;
    private FloatingActionButton mFabFinish;
    private AnimAdapter mAdapter;

    @Override
    protected int setLayout() {
        return R.layout.activity_anim;
    }

    @Override
    protected void initView() {
        mRv = findViewById(R.id.rv);
        mClContainer = findViewById(R.id.cl_container);
        mFabRemove = findViewById(R.id.fab_remove);
        mFabPreview = findViewById(R.id.fab_preview);
        mFabFinish = findViewById(R.id.fab_finish);
    }

    @Override
    protected void initData() {
        List<String> list = new ArrayList<>();
        list.add("Alpha");
        list.add("Scale");
        list.add("Translation");
        list.add("Rotation");
        list.add("Custom Attribute");
        list.add("Custom Toggle");
        list.add("Image Transition");
        list.add("Keyframe Position");
        list.add("Keyframe Interpolation");
        list.add("KeyCycle");
        list.add("KeyTimeCycle");
        list.add("Coordinator Layout");
        list.add("Drawer Layout");
        list.add("Parallax Layout");
        list.add("Full Screen Layout");
        list.add("Multi State Layout");
        list.add("Test");

        mAdapter = new AnimAdapter();
        mRv.setLayoutManager(new LinearLayoutManager(this));
        mRv.setAdapter(mAdapter);
        mAdapter.setData(list);
    }

    @Override
    protected void initListener() {
        mFabRemove.setOnClickListener(v -> {
            if (mClContainer.getChildCount() > 0) {
                mClContainer.removeAllViews();
            }
        });
        mFabPreview.setOnClickListener(v -> {
            if (mClContainer.getChildCount() > 0) {
                mClContainer.removeAllViews();
            }
            Preview preview = new Preview(AnimActivity.this);
            MotionLayout mlPreview = preview.findViewById(R.id.ml_preview);
            mClContainer.addView(preview);
            if (mlPreview.getProgress() == 0) {
                mlPreview.transitionToEnd();
            } else {
                mlPreview.transitionToStart();
            }
        });
        mFabFinish.setOnClickListener(v -> finish());

        mAdapter.setOnItemClickListener(position -> {
            mClContainer.removeAllViews();
            if (position == 0) {
                AlphaView alphaView = new AlphaView(AnimActivity.this);
                mClContainer.addView(alphaView);
            }
            if (position == 1) {
                ScaleView scaleView = new ScaleView(AnimActivity.this);
                mClContainer.addView(scaleView);
            }
            if (position == 2) {
                TranslationView translationView = new TranslationView(AnimActivity.this);
                mClContainer.addView(translationView);
            }
            if (position == 3) {
                RotationView rotationView = new RotationView(AnimActivity.this);
                mClContainer.addView(rotationView);
            }
            if (position == 4) {
                CustomColorView customColorView = new CustomColorView(AnimActivity.this);
                mClContainer.addView(customColorView);
            }
            if (position == 5) {
                ToggleButtonView buttonView = new ToggleButtonView(AnimActivity.this);
                mClContainer.addView(buttonView);
            }
            if (position == 6) {
                ImageTransitionView transitionView = new ImageTransitionView(AnimActivity.this);
                mClContainer.addView(transitionView);
            }
            if (position == 7) {
                KeyframePositionView positionView = new KeyframePositionView(AnimActivity.this);
                mClContainer.addView(positionView);
            }
            if (position == 8) {
                KeyframeInterpolationView interpolationView = new KeyframeInterpolationView(AnimActivity.this);
                mClContainer.addView(interpolationView);
            }
            if (position == 9) {
                KeyCycleView cycleView = new KeyCycleView(AnimActivity.this);
                mClContainer.addView(cycleView);
            }
            if (position == 10) {
                KeyTimeCycleView timeCycleView = new KeyTimeCycleView(AnimActivity.this);
                mClContainer.addView(timeCycleView);
            }
            if (position == 11) {
                CoordinatorLayoutView coordinatorView = new CoordinatorLayoutView(AnimActivity.this);
                mClContainer.addView(coordinatorView);
            }
            if (position == 12) {
                DrawerLayoutView drawerView = new DrawerLayoutView(AnimActivity.this);
                mClContainer.addView(drawerView);
            }
            if (position == 13) {
                ParallaxView parallaxView = new ParallaxView(AnimActivity.this);
                mClContainer.addView(parallaxView);
            }
            if (position == 14) {
                FullScreenView fullScreenView = new FullScreenView(AnimActivity.this);
                mClContainer.addView(fullScreenView);
            }
            if (position == 15) {
                MultiStateView multiStateView = new MultiStateView(AnimActivity.this);
                mClContainer.addView(multiStateView);
            }
            if (position == 16) {
                TestView testView = new TestView(AnimActivity.this);
                mClContainer.addView(testView);
            }
        });
    }

}