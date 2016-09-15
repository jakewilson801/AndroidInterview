package com.summitcoding.imzytest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Logan on 9/14/2016.
 */
public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {
    List<Flickr> mItems;

    public CardAdapter() {
        super();
        mItems = new ArrayList<Flickr>();
    }

    public void addData(Flickr flickr) {
        mItems.add(flickr);
        notifyDataSetChanged();
    }

    public void clear() {
        mItems.clear();
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recycler_view, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Flickr flickrPhoto = mItems.get(i);
//        viewHolder.title.setText(flickrPhoto.getPhoto().get(0).getTitle());
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;

        public ViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
        }
    }
}
