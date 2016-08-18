package com.riverpearl.myhwahae.view;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.riverpearl.myhwahae.R;
import com.riverpearl.myhwahae.data.HwapleData;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Tacademy on 2016-08-18.
 */
public class HomeHwapleView extends FrameLayout {

    HwapleData data;

    @BindView(R.id.img_hwaple)
    ImageView hwapleView;

    @BindView(R.id.text_title)
    TextView titleView;

    public HomeHwapleView(Context context) {
        super(context);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.view_home_hwaple, this);
        ButterKnife.bind(this);
    }

    public HwapleData getData() {
        return data;
    }

    public void setData(HwapleData data) {
        this.data = data;

        hwapleView.setImageDrawable(data.getImage());
        titleView.setText(data.getTitle());
    }
}
