package com.stevechuls.copy.fragment;

import android.graphics.drawable.Drawable;

/**
 * Created by entermate_ksc on 2018. 4. 9..
 */

public class FragmentItem {

    private Drawable drawable;
    private String text;

    public Drawable getDrawable()
    {
        return this.drawable;
    }

    public void setDrawable(Drawable drawable)
    {
        this.drawable = drawable;
    }

    public String getText()
    {
        return this.text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

}
