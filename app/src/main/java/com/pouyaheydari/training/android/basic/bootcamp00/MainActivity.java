package com.pouyaheydari.training.android.basic.bootcamp00;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtTitle = findViewById(R.id.txtTitle);
        Button btnSave = findViewById(R.id.btnSave);


        EditText edtAge = findViewById(R.id.edtAge);

        txtTitle.setText(HtmlCompat.fromHtml("<h2>Title</h2><br><p>Description here</p>",HtmlCompat.FROM_HTML_MODE_COMPACT));

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Data Saved",Toast.LENGTH_LONG).show();
            }
        });
    }
}