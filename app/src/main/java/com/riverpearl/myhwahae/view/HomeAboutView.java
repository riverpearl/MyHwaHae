package com.riverpearl.myhwahae.view;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.riverpearl.myhwahae.R;
import com.riverpearl.myhwahae.data.AboutData;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Tacademy on 2016-08-18.
 */
public class HomeAboutView extends FrameLayout {

    AboutData data;

    @BindView(R.id.img_icon)
    ImageView iconView;

    @BindView(R.id.text_title)
    TextView titleView;

    @BindView(R.id.text_content)
    TextView contentView;

    public HomeAboutView(Context context) {
        super(context);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.view_home_about, this);
        ButterKnife.bind(this);
    }

    public AboutData getData() {
        return data;
    }

    public void setData(AboutData data) {
        this.data = data;

        setBackgroundColor(data.getColor());
        iconView.setImageDrawable(data.getIcon());
        titleView.setText(data.getTitle());
        contentView.setText(data.getContent());
    }
}
