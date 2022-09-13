package com.fwkily.jvmdemo.stack;

public class DynamicLinkingTest {

    int a = 10;
    public void test1() {
        System.out.println("test1");
    }

    public void test2() {
        test1();
        a ++;
        System.out.println("test2");
    }

}
