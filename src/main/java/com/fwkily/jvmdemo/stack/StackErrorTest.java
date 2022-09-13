package com.fwkily.jvmdemo.stack;

/**
 * 演示堆栈溢出的问题
 */
public class StackErrorTest {

    /**java.lang.StackOverflowError
     * 堆栈溢出的问题
     * @param args
     *
     * 默认情况下count：10824
     * 设置虚拟机栈大小 -Xss256k  count：1874
     */


    private  static int count = 1;
    public static void main(String[] args) {
        System.out.println(count);
        count++;
        main(args);
    }



}
