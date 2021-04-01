package com.pouyaheydari.training.android.basic.bootcamp00;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class TestThreadActivity extends AppCompatActivity implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_thread_actiity);

        Log.d("TAG", Thread.currentThread().getName());

        TestThreadClass thread = new TestThreadClass();
        thread.start();

        Thread thread1 = new Thread(this);
        thread1.start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}