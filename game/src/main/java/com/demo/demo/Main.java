package com.demo.demo;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    private static final AtomicInteger threadNumber = new AtomicInteger(1);

    private static class Task implements Runnable {
        private String name;
        private CountDownLatch latch;
        public Task(String name,CountDownLatch latch){
            this.name = name;
            this.latch = latch;
        }
        @Override
        public void run() {
            System.out.println(name+ "完成了");
            latch.countDown();
        }
    }
    

    private static class MyThreadFactory implements ThreadFactory {

        private final String namePrefix;

        public MyThreadFactory(String namePrefix) {
            this.namePrefix = namePrefix;
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, namePrefix + "-" + threadNumber.getAndIncrement());
        }

    }
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = new ThreadPoolExecutor(
                5,
                5,
                30,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(2),
                new MyThreadFactory("threadFromPool"),
                new ThreadPoolExecutor.AbortPolicy()
        );

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                5,
                5,
                30,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(2),
                new MyThreadFactory("threadFromPool"),
                new ThreadPoolExecutor.AbortPolicy()
        );
        threadPoolExecutor.setCorePoolSize(10);


        CountDownLatch countDownLatch = new CountDownLatch(5);

        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Runnable() {
            @Override
            public void run() {

            }
        });

        Task t1 = new Task("买菜", countDownLatch);
        Task t2 = new Task("洗菜", countDownLatch);
        Task t3 = new Task("切菜", countDownLatch);
        Task t4 = new Task("开火", countDownLatch);
        Task t5 = new Task("烧菜", countDownLatch);
        executorService.execute(t1);
        executorService.execute(t2);
        executorService.execute(t3);
        executorService.execute(t4);
        executorService.execute (t5);
        countDownLatch.await();
        System.out.println("一顿饭做完了");

    }
}
