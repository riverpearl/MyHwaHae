package com.riverpearl.myhwahae.view;

import android.content.Context;
import android.support.v7.widget.GridLayout;
import android.widget.FrameLayout;

import com.riverpearl.myhwahae.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Tacademy on 2016-08-18.
 */
public class HomeRankingGridView extends FrameLayout {

    @BindView(R.id.container)
    GridLayout container;

    public HomeRankingGridView(Context context) {
        super(context);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.view_home_ranking_grid, this);
        ButterKnife.bind(this);
    }
}
