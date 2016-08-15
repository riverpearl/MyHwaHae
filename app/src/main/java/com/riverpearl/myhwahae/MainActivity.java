package com.riverpearl.myhwahae;

import android.content.Intent;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.tabhost)
    FragmentTabHost tabHost;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_mypage) {
            Intent intent = new Intent(MainActivity.this, MypageActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
