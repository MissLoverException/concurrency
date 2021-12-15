package com.missloverexception.concurrency.example.lock;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * condition维护了等待队列
 */
@Slf4j
public class LockExample6 {

    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition condition = reentrantLock.newCondition();

        new Thread(() -> {
            try {
                reentrantLock.lock();
                log.info("wait signal 1"); // 1
                condition.await();      //释放锁
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.info("get signal 1"); // 4
            condition.signal();
            reentrantLock.unlock();
        }).start();

        new Thread(() -> {
            try {
                reentrantLock.lock();
                log.info("wait signal 2"); // 1
                condition.await();      //释放锁
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.info("get signal 2"); // 4
            condition.signal();
            reentrantLock.unlock();
        }).start();

        new Thread(() -> {
            reentrantLock.lock();
            log.info("get lock"); // 2
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            condition.signal();
            log.info("send signal ~ "); // 3
            reentrantLock.unlock();
        }).start();
    }
}
