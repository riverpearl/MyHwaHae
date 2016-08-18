package com.riverpearl.myhwahae;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.riverpearl.myhwahae.adapter.HomeAdapter;
import com.riverpearl.myhwahae.data.AboutData;
import com.riverpearl.myhwahae.data.HwapleData;
import com.riverpearl.myhwahae.data.PopularData;
import com.riverpearl.myhwahae.data.RankData;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    @BindView(R.id.list_home)
    ListView listView;

    HomeAdapter hAdapter;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, view);

        hAdapter = new HomeAdapter();
        listView.setAdapter(hAdapter);

        init();

        return view;
    }

    private void init() {
        RankData r = new RankData();
        r.setRank(ContextCompat.getDrawable(getContext(), R.drawable.rank_one));
        r.setImage(ContextCompat.getDrawable(getContext(), R.drawable.lipstick_one));
        r.setBrand("mac");
        r.setName("chilly");

        PopularData p = new PopularData();
        p.setImage(ContextCompat.getDrawable(getContext(), R.drawable.lipstick_one));
        p.setName("mac");
        r.setName("chilly");

        HwapleData h = new HwapleData();
        h.setImage(ContextCompat.getDrawable(getContext(), R.drawable.lipstick_one));
        h.setTitle("wow!");

        AboutData a = new AboutData();
        a.setColor(Color.GREEN);
        a.setIcon(ContextCompat.getDrawable(getContext(), R.drawable.mypage_like));
        a.setTitle("안녕하세요");
        a.setContent("재밌겠지요");

        hAdapter.add(r);
        hAdapter.add(p);
        hAdapter.add(p);
        hAdapter.add(p);
        hAdapter.add(h);
        hAdapter.add(a);
        hAdapter.add(a);
        hAdapter.add(a);
    }
}
