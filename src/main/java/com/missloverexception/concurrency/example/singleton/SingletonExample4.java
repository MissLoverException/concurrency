package com.missloverexception.concurrency.example.singleton;

import com.missloverexception.concurrency.annotations.NotRecommend;
import com.missloverexception.concurrency.annotations.NotThreadSafe;
import com.missloverexception.concurrency.annotations.ThreadSafe;

/**
 * 懒汉式单例 -> 双重同步锁单例模式
 * 单例实力在第一次使用时创建
 */
@NotThreadSafe
public class SingletonExample4 {

    private SingletonExample4() {

    }

    private static SingletonExample4 instance = null;

    // 1、memory = allocate() 对象内存空间分配
    // 2、ctorInstance() 初始化对象
    // 3、instance = memory 设置instance只想刚分配的内存

    //JVM和cpu优化，发生指令重排，2、3可能不是顺序，多线层情况可能还没初始化对象，另一个线程就返回了

    public static SingletonExample4 getInstance() {
        if (null == instance) {     //双重检测机制
            synchronized (SingletonExample4.class) {
                if (null == instance) {
                    instance = new SingletonExample4();
                }
            }

        }
        return instance;
    }

 }
