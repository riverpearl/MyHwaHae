package com.riverpearl.myhwahae.data;

import android.graphics.drawable.Drawable;

/**
 * Created by Tacademy on 2016-08-18.
 */
public class RankData implements HomeData {
    private Drawable rank;
    private Drawable image;
    private String brand;
    private String name;

    public Drawable getRank() {
        return rank;
    }

    public void setRank(Drawable rank) {
        this.rank = rank;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
