package com.example.mymotionlayout;

import android.content.Intent;
import android.util.Log;

import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.viewpager2.widget.ViewPager2;

import com.example.mymotionlayout.adapter.ContentAdapter;
import com.example.mymotionlayout.aty.AnimActivity;
import com.example.mymotionlayout.base.BaseActivity;
import com.example.mymotionlayout.frg.ContentFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    public static final String TAG = MainActivity.class.getSimpleName();
    private ImageFilterView mIvHome;
    private ImageFilterView mIvMap;
    private ImageFilterView mIvMusic;
    private ImageFilterView mIvRadio;
    private ImageFilterView mIvApps;
    private ImageFilterView mIvHome1;
    private MotionLayout mMlHome;
    private MotionLayout mMlMap;
    private MotionLayout mMlMusic;
    private MotionLayout mMlRadio;
    private MotionLayout mMlApps;
    private MotionLayout mMlHome1;
    private ViewPager2 mVp;
    private FloatingActionButton mFb;

    @Override
    protected int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        mMlHome = findViewById(R.id.ml_home);
        mMlMap = findViewById(R.id.ml_map);
        mMlMusic = findViewById(R.id.ml_music);
        mMlRadio = findViewById(R.id.ml_radio);
        mMlApps = findViewById(R.id.ml_apps);
        mMlHome1 = findViewById(R.id.ml_home1);

        mIvHome = findViewById(R.id.iv_home);
        mIvMap = findViewById(R.id.iv_map);
        mIvMusic = findViewById(R.id.iv_music);
        mIvRadio = findViewById(R.id.iv_radio);
        mIvApps = findViewById(R.id.iv_apps);
        mIvHome1 = findViewById(R.id.iv_home1);
        mVp = findViewById(R.id.vp);

        mFb = findViewById(R.id.fb);
    }

    @Override
    protected void initData() {
        List<ContentFragment> fragments = new ArrayList<>();
        fragments.add(new ContentFragment("Home"));
        fragments.add(new ContentFragment("Map"));
        fragments.add(new ContentFragment("Music"));
        fragments.add(new ContentFragment("Radio"));
        fragments.add(new ContentFragment("Apps"));
        fragments.add(new ContentFragment("Other"));
        ContentAdapter adapter = new ContentAdapter(this, fragments);
        mVp.setAdapter(adapter);
    }

    @Override
    protected void initListener() {
        mIvHome.setOnClickListener(v -> {
            if (mMlHome.getProgress() == 0) {
                mMlHome.transitionToEnd();
            } else {
                mMlHome.transitionToStart();
            }
            mVp.setCurrentItem(0, true);
            Log.d(TAG, "click: home");
        });

        mIvMap.setOnClickListener(v -> {
            if (mMlMap.getProgress() == 0) {
                mMlMap.transitionToEnd();
            } else {
                mMlMap.transitionToStart();
            }
            mVp.setCurrentItem(1, true);
            Log.d(TAG, "click: map");
        });

        mIvMusic.setOnClickListener(v -> {
            if (mMlMusic.getProgress() == 0) {
                mMlMusic.transitionToEnd();
            } else {
                mMlMusic.transitionToStart();
            }
            mVp.setCurrentItem(2, true);
            Log.d(TAG, "click: map");
        });

        mIvRadio.setOnClickListener(v -> {
            if (mMlRadio.getProgress() == 0) {
                mMlRadio.transitionToEnd();
            } else {
                mMlRadio.transitionToStart();
            }
            mVp.setCurrentItem(3, true);
            Log.d(TAG, "click: radio");
        });

        mIvApps.setOnClickListener(v -> {
            if (mMlApps.getProgress() == 0) {
                mMlApps.transitionToEnd();
            } else {
                mMlApps.transitionToStart();
            }
            mVp.setCurrentItem(4, true);
            Log.d(TAG, "click: apps");
        });

        mIvHome1.setOnClickListener(v -> {
            if (mMlHome1.getProgress() == 0) {
                mMlHome1.transitionToEnd();
            } else {
                mMlHome1.transitionToStart();
            }
            mVp.setCurrentItem(5, true);
            Log.d(TAG, "click: apps");
        });

        mVp.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                switch (position) {
                    case 0:
                        mMlHome.transitionToEnd();
                        mMlMap.transitionToStart();
                        mMlMusic.transitionToStart();
                        mMlRadio.transitionToStart();
                        mMlApps.transitionToStart();
                        mMlHome1.transitionToStart();
                        break;
                    case 1:
                        mMlMap.transitionToEnd();
                        mMlHome.transitionToStart();
                        mMlMusic.transitionToStart();
                        mMlRadio.transitionToStart();
                        mMlApps.transitionToStart();
                        mMlHome1.transitionToStart();
                        break;
                    case 2:
                        mMlMusic.transitionToEnd();
                        mMlHome.transitionToStart();
                        mMlMap.transitionToStart();
                        mMlRadio.transitionToStart();
                        mMlApps.transitionToStart();
                        mMlHome1.transitionToStart();
                        break;
                    case 3:
                        mMlRadio.transitionToEnd();
                        mMlHome.transitionToStart();
                        mMlMap.transitionToStart();
                        mMlMusic.transitionToStart();
                        mMlApps.transitionToStart();
                        mMlHome1.transitionToStart();
                        break;
                    case 4:
                        mMlApps.transitionToEnd();
                        mMlHome.transitionToStart();
                        mMlMap.transitionToStart();
                        mMlMusic.transitionToStart();
                        mMlRadio.transitionToStart();
                        mMlHome1.transitionToStart();
                        break;
                    case 5:
                        mMlHome1.transitionToEnd();
                        mMlHome.transitionToStart();
                        mMlMap.transitionToStart();
                        mMlMusic.transitionToStart();
                        mMlRadio.transitionToStart();
                        mMlApps.transitionToStart();
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });

        mFb.setOnClickListener(v -> startActivity(new Intent(this, AnimActivity.class)));
    }

}