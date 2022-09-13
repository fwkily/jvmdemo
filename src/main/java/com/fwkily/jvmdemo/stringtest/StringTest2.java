package com.fwkily.jvmdemo.stringtest;

import java.util.Objects;

public class StringTest2 {

    public static void main(String[] args) throws InterruptedException {
//        String s = new String();
//        System.out.println("66666");
//        Thread.sleep(1000000);

        String s = "张三";
        String t = "张三";
        String w= new String("张三");
        System.out.println(Objects.equals(s,w));
        System.out.println(s.intern().equals(w.intern()));
    }



}
