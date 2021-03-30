package com.pouyaheydari.training.android.basic.bootcamp00;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class TestVideoViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_video_viewctivity);

        VideoView vv = findViewById(R.id.vv);
        String url = "https://hajifirouz1.cdn.asset.aparat.com/aparat-video/c1b967d58325db1e25f495b6b0de64ab31612071-144p.mp4?wmsAuthSign=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0b2tlbiI6IjU0NmVmMjdmYTlmYzdlNmYzYjNjMWIwOGQwOTE4ZjE0IiwiZXhwIjoxNjE3MTAyNjcyLCJpc3MiOiJTYWJhIElkZWEgR1NJRyJ9.cxk2843eZc83O2Sb9V1RhYx_wo3UY0Y49P-54QzRnx8";

        vv.setVideoURI(Uri.parse(url));
        vv.setMediaController(new MediaController(TestVideoViewActivity.this));
        vv.start();
    }
}