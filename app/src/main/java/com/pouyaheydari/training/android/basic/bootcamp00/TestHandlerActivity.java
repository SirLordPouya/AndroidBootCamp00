package com.pouyaheydari.training.android.basic.bootcamp00;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TestHandlerActivity extends AppCompatActivity {

    boolean hasBackPressed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_handler);
    }

    @Override
    public void onBackPressed() {
        if (hasBackPressed == true) {
            super.onBackPressed();
        } else {
            hasBackPressed = true;
            Toast.makeText(TestHandlerActivity.this, "Press back again to exit", Toast.LENGTH_SHORT).show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    hasBackPressed = false;
                }
            }, 2500);
        }


    }
}