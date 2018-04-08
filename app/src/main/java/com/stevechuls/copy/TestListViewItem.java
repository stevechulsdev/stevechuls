package com.stevechuls.copy;

import android.graphics.drawable.Drawable;

public class TestListViewItem {

    private Drawable drawable;
    private String name;

    public Drawable getDrawable()
    {
        return this.drawable;
    }

    public void setDrawable(Drawable drawable)
    {
        this.drawable = drawable;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
