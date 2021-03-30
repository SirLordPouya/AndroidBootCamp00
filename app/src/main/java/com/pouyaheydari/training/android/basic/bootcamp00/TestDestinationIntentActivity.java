package com.pouyaheydari.training.android.basic.bootcamp00;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TestDestinationIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_destination_intent);

        TextView txtName = findViewById(R.id.txtName);
        EditText edtFamily = findViewById(R.id.edtFamily);
        Button btnSave = findViewById(R.id.btnSave);

        Intent i = getIntent();
        String name = i.getStringExtra("name");
        txtName.setText(name);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String family = edtFamily.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("family", family);
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });
    }
}