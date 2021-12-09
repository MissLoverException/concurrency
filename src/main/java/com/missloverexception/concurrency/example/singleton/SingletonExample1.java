package com.missloverexception.concurrency.example.singleton;

import com.missloverexception.concurrency.annotations.NotThreadSafe;

/**
 * 懒汉式单例
 * 单例实力在第一次使用时创建
 */
@NotThreadSafe
public class SingletonExample1 {

    private SingletonExample1() {

    }

    private static SingletonExample1 instance = null;

    public static SingletonExample1 getInstance() {
        if (null == instance) {
            instance = new SingletonExample1();
        }
        return instance;
    }

 }
