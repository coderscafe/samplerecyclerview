package net.coderscafe.samplerecyclerview;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<String> mItems;

    public MyAdapter(List<String> items) {
        mItems = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Initialize the view holder here
        View view = LayoutInflater.from(parent.getContext())
                                  .inflate(R.layout.list_item_text, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // Show the data here
        String name = mItems.get(position);
        holder.itemName.setText(name);
    }

    @Override
    public int getItemCount() {
        // Return the size of the items
        return mItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView itemName;
        public ViewHolder(View itemView) {
            super(itemView);
            itemName = (TextView) itemView.findViewById(R.id.item_name);
        }
    }
}
