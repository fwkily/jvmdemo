package com.fwkily.jvmdemo.gc;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * @Description TODO
 * @author fuwk
 * @date 2022/9/21 4:44 PM
 * 使用UseParNewGC： -XX:+UseParNewGC -XX:+UseConcMarkSweepGC
 * 使用serialGC：-XX:+UseSerialGC
 * jdk8 默认：-XX:+UseParallelGC
 *          当开启-XX:+UseParallelGC，UseParallelOldGC也激活，他们两个互相激活（开启一个，另一个默认激活）
 */
public class TestGCRoots {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Object> list = new ArrayList<>();
        Date date = new Date();
        for (int i = 0; i < 100; i++) {
            list.add(String.valueOf(i));
            Thread.sleep(10);
        }
        System.out.println("数据添加完毕，请操作！");
        new Scanner(System.in).nextLine();
        list = null;
        date = null;
        System.out.println("list和date已置空，请操作");
        new Scanner(System.in).nextLine();
        System.out.println("结束");




    }


}
