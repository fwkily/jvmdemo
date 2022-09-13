package com.fwkily.jvmdemo.stringtest;

public class StringTest6 {

    static int count = 100000;

    /**
     * 执行效率：使用StringBuilder的append方式效率远高于字符串拼接方式
     * 1、Stringbuilder.append方式，始终只创建一个Stringbuilder对象
     * 2、使用String拼接方式，会创建多个sringbuiler和string对象
     * 3、使用String拼接方式，内存由于创建了大量对象，如果进行GC，会花费额外时间
     *
     * 改进方案：在实际开发中，如果基本确定前前后后添加的字符串长度不高于某个值（highLevel）,建议使用
     * StringBuilder sb = new StringBuilder(highLevel)
     * @param args
     */
    public static void main(String[] args) {

//        test1();//6462ms

        test2();//8ms



    }


    public static void test1(){
        long start = System.currentTimeMillis();

        String src = "";
        for (int i = 0; i < count; i++) {
            src = src + "a";
        }

        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }

    public static void test2(){
        long start = System.currentTimeMillis();

        StringBuilder src = new StringBuilder();

        for (int i = 0; i < count; i++) {
            src.append("a");
        }

        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }

}
