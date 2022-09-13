package com.fwkily.jvmdemo.stringtest;

public class StringNewTest {

    public static void main(String[] args) {
        /**
         * 创建了两个对象，new创建了一个，还有字符串常量池创建一个"ab"
         */
//        String s1 = new String("ab");

        /**
         * 共创建了6个对象
         * new String("a")生成2个，new String("b")生成2个
         * new StringBuilder生成1个
         * StringBuilder.toString()生成一个
         * StringBuilder.toString(),在字符串常量池中没有生成"ab"
         */
        String s2 = new String("a") + new String("b");


    }

}
