package com.missloverexception.concurrency.example.singleton;

import com.missloverexception.concurrency.annotations.NotRecommend;
import com.missloverexception.concurrency.annotations.NotThreadSafe;
import com.missloverexception.concurrency.annotations.ThreadSafe;

/**
 * 懒汉式单例
 * 单例实力在第一次使用时创建
 */
@ThreadSafe
@NotRecommend
public class SingletonExample3 {

    private SingletonExample3() {

    }

    private static SingletonExample3 instance = null;

    public synchronized static SingletonExample3 getInstance() {
        if (null == instance) {
            instance = new SingletonExample3();
        }
        return instance;
    }

 }
