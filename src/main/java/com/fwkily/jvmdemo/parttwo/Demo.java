package com.fwkily.jvmdemo.parttwo;

import java.util.ArrayList;

/**
 * @Classname Demo
 * @Description TODO
 * @Date 2022/9/22 5:49 PM
 * @Created by fuwk
 */
public class Demo {

    final int num = 21;

    {
        System.out.println("你好！");
    }

    static {
        String x = "haha";
    }

    public int add() {
//        num = num + 2;
        return num;
    }

    private String has(int a, String b, Double c) {
        return b + a + c;
    }

    public static void main(String[] args) {
//        ArrayList<byte[]> bytes = new ArrayList<>();
//
//        for (int i = 0; i < Integer.MAX_VALUE; i++) {
//            byte[] b = new byte[1024];
//            bytes.add(b);
//            try {
//                System.out.println("执行中。。。");
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }

        try {
            System.out.println("执行中。。。");
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
