package com.fwkily.jvmdemo.stack;

import java.util.Date;

/**
 * 方法的结束方式有两种：
 * 1、正常结束，通过return语句返回
 * 2、异常结束，通过throw语句抛出异常，通过抛出未捕获处理的异常结束
 */
public class StackFrameTest {

    private int count = 10;
    public static void main(String[] args) {
        StackFrameTest stackFrameTest = new StackFrameTest();
        stackFrameTest.method1();

        System.out.println("main正常结束");
    }

    public StackFrameTest(){
        this.count = 1;
    }

    public static void testStatic() {
        int a = 10;
        Date date = new Date();
        //因为this变量不存在与当前局部变量表中，所以不能访问到count变量
//        System.out.println(this.count);
    }

    public void method1() {
        System.out.println("method1开始执行");
        method2();
        System.out.println("method1执行结束");
//        System.out.println(10 / 0);
    }



    private int method2() {
        System.out.println("method2开始执行");
        int i = 10;
        int k = (int)method3();
        System.out.println("method2即将结束");
        return i + k;
    }

    private double method3() {
        System.out.println("method3开始执行");
        double k = 20.0;
        System.out.println("method3即将结束");
        return k;
    }

    public void method5(String a,double b) {//double或long类型变量占据两个slot变量槽
        int m = 9;
    }

    public void method6(){
        int a = 0;
        {
            int b = 0;
            b = a + 1;
        }
        //变量c占据了之前销毁的变量b占据的slot的位置
        int c = a + 1;
    }


}
