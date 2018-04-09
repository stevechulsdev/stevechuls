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

public class GridAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<ListItem> data = new ArrayList<>();

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        Context context = viewGroup.getContext();

        if(view == null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.gridview_custom_item, viewGroup, false);
        }

        ImageView profileImageView = (ImageView)view.findViewById(R.id.gridview_image);
        TextView profileTextView = (TextView)view.findViewById(R.id.gridview_text);

        ListItem listItem = data.get(i);

        profileImageView.setImageDrawable(listItem.getProfilImage());
        profileTextView.setText(listItem.getProfilName());

        return view;
    }

    public void addItem(Drawable profilImage, String profilName)
    {
        ListItem listItem = new ListItem();

        listItem.setProfilImage(profilImage);
        listItem.setProfilName(profilName);

        data.add(listItem);
    }
}
