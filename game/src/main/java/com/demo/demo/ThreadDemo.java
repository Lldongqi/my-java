package com.demo.demo;

public class ThreadDemo implements Runnable {


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
