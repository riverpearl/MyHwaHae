package com.riverpearl.myhwahae.view;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.riverpearl.myhwahae.R;
import com.riverpearl.myhwahae.data.HomeData;
import com.riverpearl.myhwahae.data.RankData;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Tacademy on 2016-08-18.
 */
public class HomeRankingView extends FrameLayout {

    RankData data;

    @BindView(R.id.img_rank)
    ImageView rankView;

    @BindView(R.id.img_preview)
    ImageView previewView;

    @BindView(R.id.text_brand)
    TextView brandView;

    @BindView(R.id.text_product_name)
    TextView nameView;

    public HomeRankingView(Context context) {
        super(context);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.view_home_ranking, this);
        ButterKnife.bind(this);
    }

    public HomeData getData() {
        return data;
    }

    public void setData(RankData data) {
        this.data = data;

        rankView.setImageDrawable(data.getRank());
        previewView.setImageDrawable(data.getImage());
        brandView.setText(data.getBrand());
        nameView.setText(data.getName());
    }
}
