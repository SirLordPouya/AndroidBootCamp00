package com.pouyaheydari.training.android.basic.bootcamp00;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TestIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_intent);

        Button btnNextActivity = findViewById(R.id.btnNextActivity);
        EditText edtName = findViewById(R.id.edtName);

        btnNextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                Intent i = new Intent(TestIntentActivity.this, TestDestinationIntentActivity.class);
                i.putExtra("name", name);
                startActivityForResult(i, 321);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 321) {
            if (resultCode == Activity.RESULT_OK) {
                String family = data.getStringExtra("family");
                Toast.makeText(TestIntentActivity.this, family, Toast.LENGTH_LONG).show();
            }
        }
    }
}