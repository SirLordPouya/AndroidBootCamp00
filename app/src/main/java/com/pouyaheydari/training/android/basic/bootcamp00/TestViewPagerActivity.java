package com.pouyaheydari.training.android.basic.bootcamp00;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class TestViewPagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_view_pager);

        ViewPager2 pager = findViewById(R.id.pager);
        TestViewPagerAdapter adapter = new TestViewPagerAdapter(TestViewPagerActivity.this);
        pager.setAdapter(adapter);
    }
}