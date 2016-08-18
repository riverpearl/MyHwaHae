package com.riverpearl.myhwahae.data;

import android.graphics.drawable.Drawable;

/**
 * Created by Tacademy on 2016-08-18.
 */
public class AboutData implements HomeData {
    private Drawable icon;
    private String title;
    private String content;
    private int color;

    public Drawable getIcon() {
        return icon;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
