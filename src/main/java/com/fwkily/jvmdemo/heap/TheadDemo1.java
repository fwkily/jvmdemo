package com.fwkily.jvmdemo.heap;

public class TheadDemo1 {

    public static void main(String[] args) {
        System.out.println("开始。。。");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("结束。。。");
    }

}
