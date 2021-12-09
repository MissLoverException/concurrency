package com.missloverexception.concurrency.example.singleton;

import com.missloverexception.concurrency.annotations.ThreadSafe;

/**
 * 饿汉式单例
 * 单例实力在类装载时进行创建
 */
@ThreadSafe
public class SingletonExample6 {

    private SingletonExample6() {

    }

    private static SingletonExample6 instance = null;

    //静态代码块要注意顺序，如果这个放在前面，就会被设置成null
    static {
        instance = new SingletonExample6();
    }


    public static SingletonExample6 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(getInstance().hashCode());
        System.out.println(getInstance().hashCode());
    }

 }
