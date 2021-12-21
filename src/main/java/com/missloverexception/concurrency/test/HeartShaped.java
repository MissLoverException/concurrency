package com.missloverexception.concurrency.test;

public class HeartShaped {

    public static void fun(int x, int y, int a) throws Exception {
        if (Math.pow(x, 2) + Math.pow(y, 2) + a * x <= a * Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2))) {
            delay(2);
            System.out.print("\u7231");
//            printSingleColor( 33, 0,"\u7231");
            delay(2);
            System.out.print("\u4f73");
//            printSingleColor( 34, 0,"\u4f73");
            delay(2);
            System.out.print("\u4f73");
//            printSingleColor( 35, 0,"\u4f73");
//              System.out.print(" * ");
        } else {
            System.out.print("     ");
        }
    }

    public static void delay(long time) throws Exception {
        System.out.print("_");
        Thread.sleep(time);
        System.out.print("\b");
        Thread.sleep(time);
//        System.out.print("_");
//        Thread.sleep(30);
//        System.out.print("\b");
    }

    public static void printSingleColor(int code,int n,String content) {
        System.out.print("\33[" + code + ";" + n + "m" + content);
    }

    public static void main(String[] args) throws Exception {
        final int a = 10;
        for (int i = 5; i >= -25; i--) {
            for (int j = -15; j <= 15; j++) {
                fun(i, j, a);
            }
            System.out.println();
        }
    }
}
