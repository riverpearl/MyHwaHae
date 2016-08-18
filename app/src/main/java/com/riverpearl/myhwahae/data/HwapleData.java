package com.riverpearl.myhwahae.data;

import android.graphics.drawable.Drawable;

/**
 * Created by Tacademy on 2016-08-18.
 */
public class HwapleData implements HomeData {
    private Drawable image;
    private String title;

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
