package com.example.mymotionlayout.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.mymotionlayout.frg.ContentFragment;

import java.util.List;

public class ContentAdapter extends FragmentStateAdapter {

    private List<ContentFragment> data;

    public ContentAdapter(@NonNull FragmentActivity fragmentActivity, List<ContentFragment> datas) {
        super(fragmentActivity);
        this.data = datas;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return data.get(position);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
