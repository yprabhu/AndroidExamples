package com.yprabhu.recyclerviewexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class StaggeredRecyclerAdapter extends RecyclerView.Adapter<StaggeredRecyclerAdapter.ViewHolder> {

    private List<String> items;
    private int itemLayout;

    public StaggeredRecyclerAdapter(List<String> items, int itemLayout) {
        this.items = items;
        this.itemLayout = itemLayout;
    }

    @Override public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(itemLayout, parent, false);
        return new ViewHolder(v);
    }

    @Override public void onBindViewHolder(ViewHolder holder, int position) {
        String item = items.get(position);
        holder.text.setText(item);
        holder.itemView.setTag(item);
    }

    @Override public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView text;

        public ViewHolder(View itemView) {
            super(itemView);
            text = (TextView) itemView.findViewById(R.id.text);
        }
    }

    public void add(String item, int position) {
        items.add(position, item);
        notifyItemInserted(position);
    }

    public void remove(String item) {
        int position = items.indexOf(item);
        items.remove(position);
        notifyItemRemoved(position);
    }
}
