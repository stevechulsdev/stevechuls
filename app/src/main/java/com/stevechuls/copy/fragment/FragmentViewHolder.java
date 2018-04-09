package com.stevechuls.copy.fragment;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.stevechuls.copy.R;

/**
 * Created by entermate_ksc on 2018. 4. 9..
 */

public class FragmentViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageView;
    public TextView textView;

    public FragmentViewHolder(View convertView)
    {
        super(convertView);

        imageView = (ImageView)convertView.findViewById(R.id.image_view);
        textView = (TextView)convertView.findViewById(R.id.text_view);
    }


}
