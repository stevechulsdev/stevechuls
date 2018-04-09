package com.stevechuls.copy;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by entermate_ksc on 2018. 4. 6..
 */

public class ListAdapter extends BaseAdapter {

    private ArrayList<ListItem> mlistItem = new ArrayList<>();

    @Override
    public int getCount() {
        return mlistItem.size();
    }

    @Override
    public Object getItem(int position) {
        return mlistItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        Context context = viewGroup.getContext();

        if(view == null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.listview_custom, viewGroup, false);
        }

        ImageView profileImageView = (ImageView)view.findViewById(R.id.profilImageView);
        TextView profileTextView = (TextView)view.findViewById(R.id.profileTextView);

        ListItem listItem = mlistItem.get(position);

        profileImageView.setImageDrawable(listItem.getProfilImage());
        profileTextView.setText(listItem.getProfilName());

        return view;
    }

    public void addItem(Drawable profilImage, String profilName)
    {
        ListItem listItem = new ListItem();

        listItem.setProfilImage(profilImage);
        listItem.setProfilName(profilName);

        mlistItem.add(listItem);
    }
}
