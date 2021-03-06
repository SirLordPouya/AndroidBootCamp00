package com.pouyaheydari.training.android.basic.bootcamp00;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class TestKebabMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_kebab_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        menu.add(0, 1, 1, "Added By Java");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.firstItem:
                Toast.makeText(this, "First Item Clicked!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.secondItem:
                Toast.makeText(this, "Second Item Clicked!", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(this, "Added by Java Clicked!", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}