package com.riverpearl.myhwahae;

import android.content.Intent;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.tabhost)
    FragmentTabHost tabHost;

    @BindView(R.id.text_keyword)
    TextView keywordView;

    public final static String TAG_HOME = "home";
    public final static String TAG_REVIEW = "review";
    public final static String TAG_INGREDIENT = "ingredient";
    public final static String TAG_HWAPLE = "hwaple";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        String labelHome = getResources().getString(R.string.title_home);
        String labelReview = getResources().getString(R.string.title_review);
        String labelIngredient = getResources().getString(R.string.title_ingredient);
        String labelHwaple = getResources().getString(R.string.title_hwaple);

        tabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);
        tabHost.addTab(tabHost.newTabSpec(TAG_HOME).setIndicator(labelHome), HomeFragment.class, null);
        tabHost.addTab(tabHost.newTabSpec(TAG_REVIEW).setIndicator(labelReview), ReviewFragment.class, null);
        tabHost.addTab(tabHost.newTabSpec(TAG_INGREDIENT).setIndicator(labelIngredient), IngredientFragment.class, null);
        tabHost.addTab(tabHost.newTabSpec(TAG_HWAPLE).setIndicator(labelHwaple), IngredientFragment.class, null);
    }

    @OnClick(R.id.img_logo)
    public void onLogoClick(View view) {
        tabHost.setCurrentTabByTag(TAG_HOME);
    }

    @OnClick(R.id.img_mypage)
    public void onMyPageClick(View view) {
        Intent intent = new Intent(MainActivity.this, MypageActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.img_search)
    public void onSearchClick(View view) {
        String keyword = keywordView.getText().toString();

        if (!TextUtils.isEmpty(keyword)) {
            //상품상세
        }

    }

    @OnClick(R.id.text_keyword)
    public void onKeywordClick(View view) {
        //검색창
    }
}
