package com.example.mymotionlayout.frg;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mymotionlayout.R;

public class ContentFragment extends Fragment {

    private TextView mTvContent;

    private String mContent;

    public ContentFragment(String content) {
        mContent = content;
    }

    public void setContent(String content) {
        mContent = content;
        mTvContent.setText(mContent);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_content, container, false);
        mTvContent = view.findViewById(R.id.tv_content);
        mTvContent.setText(mContent);
        mTvContent.setTypeface(Typeface.MONOSPACE, Typeface.BOLD);
        return view;
    }

}
