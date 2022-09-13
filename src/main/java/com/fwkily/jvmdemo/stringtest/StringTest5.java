package com.fwkily.jvmdemo.stringtest;


/**
 *
 */
public class StringTest5 {

    public static void main(String[] args) {
//        //编译期优化，等同于"abc"
//        String a = "a" + "b" + "c";
//        String b = "abc";
//        System.out.println(a == b);
//        System.out.println(a.equals(b));


//        /**
//         * new Stringbuilder("a")、
//         * new Stringbuilder("b")、
//         * 字符串拼接+ 约等于StringBuilder sb = StringBuilder("ab")
//           * sb.toStirng()
//         *jdk1.5及之后用的stringbuilder，1.5之前用的stringbuffer
//         */
        String s1 = "a";
        String s2 = "b";
        String s3 = "ab";
        String s4 = s1 + s2;
        System.out.println(s3 == s4);//false


        /**
         *1、字符串拼接操作不一定都是用的stringbuider
         * 如果字符串左右两边都是字符串常量或常量引用，则仍然使用编译器优化，即非stringbuilder的方式
         * 2、针对于final修饰类、方法、基本数据类型、引用数据类型的量的结构式，能用final的时候建议用上
         */
//        final String s1 = "a";
//        final String s2 = "b";
//        String s3 = "ab";
//        String s4 = s1 + s2;
//        System.out.println(s3 == s4);//true





    }



}
