package com.fwkily.jvmdemo.parttwo;

/**
 * @Classname StringTest
 * @Description TODO
 * @Date 2022/9/22 4:18 PM
 * @Created by fuwk
 */
public class StringTest {

    public static void main(String[] args) {
        String s1 = new String("hello") + new String("world");
        String s2= "helloworld";
        System.out.println(s1 == s2);
        String s3 = new String("helloworld");
        System.out.println(s2 == s3);
        System.out.println(s1 == s3);

    }
}
