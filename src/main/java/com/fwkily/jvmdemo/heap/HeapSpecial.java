package com.fwkily.jvmdemo.heap;

/**
 * 1、设置堆空间内存的参数
 * -Xms 用来设置堆空间（年轻代 + 老年代）的初始内存大小
 *      -X ： 是jvm的运行参数
 *      -ms： 是memory start
 *  -Xmx： 用来设置堆空间（年轻代 + 老年代）的最大内存大小
 *
 *  2、默认堆空间的大小
 *  初始内存大小： 物理电脑内存大小 / 64
 *  最大内存大小： 物理电脑内存大小 / 4
 *
 *  3、手动设置：-Xms600m -Xmx600m
 *      开发中建议将初始堆内存和最大对内存设置成相同的值
 *
 *  4、查看设置的参数: 方式一：1、jps -l 2、jstat -gc
 *                  方式二: 2、-XX:+PrintGCDetails
 *
 */
public class HeapSpecial {

    public static void main(String[] args) {
        //返回java虚拟机初始内存
        long initialMemory = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        System.out.println(initialMemory);

        //返回java虚拟机最大内存
        long maxMemory = Runtime.getRuntime().maxMemory() / 1024 / 1024;
        System.out.println(maxMemory);


//        try {
//            Thread.sleep(1000000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

    }




}
