package com.missloverexception.concurrency.example.singleton;

import com.missloverexception.concurrency.annotations.NotThreadSafe;
import com.missloverexception.concurrency.annotations.ThreadSafe;

/**
 * 懒汉式单例 -> 双重同步锁单例模式
 * 单例实力在第一次使用时创建
 */
@ThreadSafe
public class SingletonExample5 {

    private SingletonExample5() {

    }

    private volatile static SingletonExample5 instance = null;

    // 1、memory = allocate() 对象内存空间分配
    // 2、ctorInstance() 初始化对象
    // 3、instance = memory 设置instance只想刚分配的内存

    //单例对象 volatile + 双重检测 禁止指令重拍

    public static SingletonExample5 getInstance() {
        if (null == instance) {     //双重检测机制
            synchronized (SingletonExample5.class) {
                if (null == instance) {
                    instance = new SingletonExample5();
                }
            }

        }
        return instance;
    }

 }
