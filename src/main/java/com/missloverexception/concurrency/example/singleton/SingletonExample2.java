package com.missloverexception.concurrency.example.singleton;

import com.missloverexception.concurrency.annotations.NotThreadSafe;
import com.missloverexception.concurrency.annotations.ThreadSafe;

/**
 * 饿汉式单例
 * 单例实力在类装载时进行创建
 */
@ThreadSafe
public class SingletonExample2 {

    private SingletonExample2() {

    }

    private static SingletonExample2 instance = new SingletonExample2();

    public static SingletonExample2 getInstance() {
        return instance;
    }

 }
