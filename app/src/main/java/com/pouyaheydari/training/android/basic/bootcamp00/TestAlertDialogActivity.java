package com.pouyaheydari.training.android.basic.bootcamp00;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class TestAlertDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_alert_dialog);

        AlertDialog dialog = new AlertDialog.Builder(TestAlertDialogActivity.this)
                .setTitle("AlertDialog!")
                .setMessage("This is an AlertDialog")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(TestAlertDialogActivity.this, "OK CLicked!", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(TestAlertDialogActivity.this, "No Clicked!", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNeutralButton("Ask me later", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(TestAlertDialogActivity.this, "Ask me later clicked!", Toast.LENGTH_SHORT).show();
                    }
                })
                .create();

        dialog.show();
    }
}