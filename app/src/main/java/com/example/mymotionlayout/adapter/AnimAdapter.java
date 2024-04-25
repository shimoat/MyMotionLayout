package com.example.mymotionlayout.adapter;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mymotionlayout.R;

import java.util.ArrayList;
import java.util.List;

public class AnimAdapter extends RecyclerView.Adapter<AnimAdapter.AnimHolder> {

    private List<String> data = new ArrayList<>();

    private OnItemClickListener mItemClickListener;

    public void setData(List<String> list) {
        data.clear();
        data.addAll(list);
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(OnItemClickListener itemClickListener) {
        mItemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public AnimHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_anim, parent, false);
        return new AnimHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimHolder holder, int position) {
        holder.tvAnim.setText(data.get(position));
        holder.itemView.setOnClickListener(v -> mItemClickListener.onItemClick(position));
        holder.itemView.setOnTouchListener((v, event) -> {
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                holder.mlAnim.transitionToEnd();
            }
            if (event.getAction() == MotionEvent.ACTION_UP ||
                    event.getAction() == MotionEvent.ACTION_CANCEL ||
                    event.getAction() == MotionEvent.ACTION_OUTSIDE) {
                holder.mlAnim.transitionToStart();
            }
            return false;
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class AnimHolder extends RecyclerView.ViewHolder {
        MotionLayout mlAnim;
        TextView tvAnim;

        public AnimHolder(@NonNull View itemView) {
            super(itemView);
            tvAnim = itemView.findViewById(R.id.tv_anim);
            mlAnim = itemView.findViewById(R.id.ml_item);
        }
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }
}
