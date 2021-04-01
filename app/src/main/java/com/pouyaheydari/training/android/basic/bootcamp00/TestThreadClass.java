package com.pouyaheydari.training.android.basic.bootcamp00;

public class TestThreadClass extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println(Thread.currentThread().getName());
    }
}
