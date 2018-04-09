package com.stevechuls.copy;

import android.graphics.drawable.Drawable;

/**
 * Created by entermate_ksc on 2018. 4. 6..
 */

public class ListItem {

    private Drawable profilImage;
    private String profilName;

    public Drawable getProfilImage()
    {
        return profilImage;
    }

    public void setProfilImage(Drawable profilImage)
    {
        this.profilImage = profilImage;
    }

    public String getProfilName()
    {
        return profilName;
    }

    public void setProfilName(String profilName)
    {
        this.profilName = profilName;
    }
}
