package com.stevechuls.copy.fragment;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stevechuls.copy.R;

import java.util.ArrayList;

/**
 * Created by entermate_ksc on 2018. 4. 9..
 */

public class FragmentRecyclerViewAdapter extends RecyclerView.Adapter<FragmentViewHolder> {

    private ArrayList<FragmentItem> mFragmentItemArrayList = new ArrayList<>();
    private Context context;

    public FragmentRecyclerViewAdapter(Context context, RecyclerView recyclerView)
    {
        this.context = context;
    }

    @NonNull
    @Override
    public FragmentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_recycler_item, null);
        return new FragmentViewHolder(convertView);
    }

    @Override
    public void onBindViewHolder(@NonNull FragmentViewHolder viewHolder, int position) {
        viewHolder.imageView.setImageDrawable(mFragmentItemArrayList.get(position).getDrawable());
        viewHolder.textView.setText(mFragmentItemArrayList.get(position).getText());

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public void addItem(Drawable image, String text)
    {
        FragmentItem fragmentItem = new FragmentItem();

        fragmentItem.setDrawable(image);
        fragmentItem.setText(text);

        mFragmentItemArrayList.add(fragmentItem);
    }


}
