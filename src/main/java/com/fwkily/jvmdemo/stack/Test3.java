package com.fwkily.jvmdemo.stack;

/**
 * 获取classloader的几种方式
 */
public class Test3 {

    public static void main(String[] args) throws ClassNotFoundException {
        //1
        ClassLoader classLoader = Class.forName("java.lang.Integer").getClassLoader();
        System.out.println(classLoader);//null

        //2
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(contextClassLoader);

        //3
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        //4
        ClassLoader classLoader1 = Test3.class.getClassLoader();
        System.out.println(classLoader1);



    }




}


