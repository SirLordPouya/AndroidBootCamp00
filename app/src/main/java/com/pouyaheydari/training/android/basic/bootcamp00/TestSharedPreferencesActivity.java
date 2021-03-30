package com.pouyaheydari.training.android.basic.bootcamp00;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TestSharedPreferencesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_shared_preferences);

        TextView txtName = findViewById(R.id.txtName);
        EditText edtName = findViewById(R.id.edtName);
        Button btnSave = findViewById(R.id.btnSave);

        String name = getSharedPreferences("details", MODE_PRIVATE).getString("name", "No Name!");
        txtName.setText(name);


        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                getSharedPreferences("details", MODE_PRIVATE).edit().putString("name", name).apply();
            }
        });
    }
}