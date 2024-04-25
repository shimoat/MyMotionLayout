package com.example.mymotionlayout.base;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.mymotionlayout.R;

public abstract class BaseActivity extends AppCompatActivity {

    protected abstract int setLayout();
    protected abstract void initView();
    protected abstract void initData();
    protected abstract void initListener();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(setLayout());
        overridePendingTransition(R.anim.page_open_enter, R.anim.page_open_exit);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            getWindow().getInsetsController().hide(WindowInsets.Type.statusBars());
            getWindow().getInsetsController().hide(WindowInsets.Type.navigationBars());
        }
        initView();
        initData();
        initListener();
    }


    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.page_close_enter,  R.anim.page_close_exit);
    }
}





