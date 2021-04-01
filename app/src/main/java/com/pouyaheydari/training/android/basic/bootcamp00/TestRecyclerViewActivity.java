package com.pouyaheydari.training.android.basic.bootcamp00;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TestRecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_recycler_view);

        RecyclerView recycler = findViewById(R.id.recycler);
        ArrayList<String> names = new ArrayList<>();
        names.add("Pouya Heydari");
        names.add("Ali Ahmadi");
        names.add("Mojtaba Abdolahi");
        names.add("Rosa Fathirad");
        names.add("Saman Banafshekhah");

        LinearLayoutManager manager = new LinearLayoutManager(TestRecyclerViewActivity.this, RecyclerView.VERTICAL, false);
        recycler.setLayoutManager(manager);

        TestAdapter adapter = new TestAdapter(names);
        recycler.setAdapter(adapter);

        Intent i = new Intent(TestRecyclerViewActivity.this, TestService.class);
//        ContextCompat.startForegroundService(TestRecyclerViewActivity.this, i);


        TestBroadcastReceiver receiver = new TestBroadcastReceiver();
        IntentFilter filter = new IntentFilter();
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);

        registerReceiver(receiver, filter);
    }
}