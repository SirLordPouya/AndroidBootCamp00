package com.pouyaheydari.training.android.basic.bootcamp00;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class TestDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_dialog);

        Intent i = new Intent(TestDialogActivity.this, MainActivity.class);
        startActivity(i);
    }
}