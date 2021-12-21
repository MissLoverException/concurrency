package com.missloverexception.concurrency.example.threadPool;

import lombok.extern.slf4j.Slf4j;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Slf4j
public class ThreadPoolExample4 {

    public static void main(String[] args) {

        // 调度
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);

//        executorService.schedule(new Runnable() {
//            @Override
//            public void run() {
//                log.info("schedule run");
//            }
//        }, 3, TimeUnit.SECONDS);

        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
//                log.info("schedule run");
                System.out.print("O");
            }
        }, 0, 300, TimeUnit.MILLISECONDS);
//        executorService.shutdown();

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
//                log.warn("timer run");
                System.out.print("o");
            }
        }, new Date(), 4 * 100);
    }
}
