package com.riverpearl.myhwahae.view;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.riverpearl.myhwahae.R;
import com.riverpearl.myhwahae.data.PopularData;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Tacademy on 2016-08-18.
 */
public class HomePopularView extends FrameLayout {

    PopularData data;

    @BindView(R.id.img_preview)
    ImageView previewView;

    @BindView(R.id.text_brand)
    TextView brandView;

    @BindView(R.id.text_product_name)
    TextView nameView;

    public HomePopularView(Context context) {
        super(context);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.view_home_popular, this);
        ButterKnife.bind(this);
    }

    public PopularData getData() {
        return data;
    }

    public void setData(PopularData data) {
        this.data = data;

        previewView.setImageDrawable(data.getImage());
        brandView.setText(data.getBrand());
        nameView.setText(data.getName());
    }
}
