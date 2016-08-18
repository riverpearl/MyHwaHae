package com.riverpearl.myhwahae.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.riverpearl.myhwahae.data.AboutData;
import com.riverpearl.myhwahae.data.HomeData;
import com.riverpearl.myhwahae.data.HwapleData;
import com.riverpearl.myhwahae.data.PopularData;
import com.riverpearl.myhwahae.data.RankData;
import com.riverpearl.myhwahae.view.HomeAboutView;
import com.riverpearl.myhwahae.view.HomeHwapleView;
import com.riverpearl.myhwahae.view.HomePopularView;
import com.riverpearl.myhwahae.view.HomeRankingView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tacademy on 2016-08-18.
 */
public class HomeAdapter extends BaseAdapter {
    List<HomeData> items = new ArrayList<>();

    private static final int VIEW_TYPE_COUNT = 4;
    private static final int VIEW_INDEX_RANKING = 0;
    private static final int VIEW_INDEX_POPULAR = 1;
    private static final int VIEW_INDEX_HWAPLE = 2;
    private static final int VIEW_INDEX_ABOUT = 3;

    public void add(HomeData data) {
        items.add(data);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getViewTypeCount() {
        return VIEW_TYPE_COUNT;
    }

    @Override
    public int getItemViewType(int position) {
        HomeData data = items.get(position);

        if (data instanceof RankData)
            return VIEW_INDEX_RANKING;
        else if (data instanceof PopularData)
            return VIEW_INDEX_POPULAR;
        else if (data instanceof HwapleData)
            return VIEW_INDEX_HWAPLE;
        else if (data instanceof AboutData)
            return VIEW_INDEX_ABOUT;

        throw new IllegalArgumentException("Invalid Position");
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        switch(getItemViewType(position)) {
            case VIEW_INDEX_RANKING :
                HomeRankingView rankingView;
                if (convertView == null || !(convertView instanceof HomeRankingView))
                    rankingView = new HomeRankingView(parent.getContext());
                else rankingView = (HomeRankingView)convertView;
                rankingView.setData((RankData)items.get(position));
                return rankingView;
            case VIEW_INDEX_POPULAR :
                HomePopularView popularView;
                if (convertView == null || !(convertView instanceof HomePopularView))
                    popularView = new HomePopularView(parent.getContext());
                else popularView = (HomePopularView)convertView;
                popularView.setData((PopularData)items.get(position));
                return popularView;
            case VIEW_INDEX_HWAPLE :
                HomeHwapleView hwapleView;
                if (convertView == null || !(convertView instanceof HomeHwapleView))
                    hwapleView = new HomeHwapleView(parent.getContext());
                else hwapleView = (HomeHwapleView)convertView;
                hwapleView.setData((HwapleData)items.get(position));
                return hwapleView;
            case VIEW_INDEX_ABOUT :
                HomeAboutView aboutView;
                if (convertView == null || !(convertView instanceof HomeAboutView))
                    aboutView = new HomeAboutView(parent.getContext());
                else aboutView = (HomeAboutView)convertView;
                aboutView.setData((AboutData) items.get(position));
                return aboutView;
        }

        throw new IllegalArgumentException("Invalid Position");
    }
}
