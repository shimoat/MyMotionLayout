package com.example.mymotionlayout.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mymotionlayout.R;

import java.util.ArrayList;
import java.util.List;

public class FullScreenView extends RelativeLayout {
    public FullScreenView(Context context) {
        super(context);
        init(context);
    }

    public FullScreenView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        View view = LayoutInflater.from(context).inflate(R.layout.view_fullscreen, this, true);

        List<String> data = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            data.add("Test Data " + i);
        }
        RecyclerView rv = view.findViewById(R.id.rv);
        rv.setAdapter(new RecyclerView.Adapter() {
            @NonNull
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View itemView = LayoutInflater.from(context).inflate(R.layout.item_anim, parent, false);
                return new DataHolder(itemView);
            }

            @Override
            public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
                ((DataHolder) holder).tv.setText(data.get(position));
            }

            @Override
            public int getItemCount() {
                return data.size();
            }
        });
    }

    class DataHolder extends RecyclerView.ViewHolder {
        private TextView tv;

        public DataHolder(@NonNull View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.tv_anim);
        }
    }
}
