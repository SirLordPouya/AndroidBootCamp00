package com.pouyaheydari.training.android.basic.bootcamp00;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class TestPicassoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_picasso);

        ImageView imgVenom = findViewById(R.id.imgVenom);
        String url = "https://www.denofgeek.com/wp-content/uploads/2019/08/venom_5.jpg";
        Picasso.get().load(url).into(imgVenom);
    }
}