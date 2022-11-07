package com.fwkily.jvmdemo.gc;

import java.util.ArrayList;

/**
 * @Classname GCTest
 * @Description TODO
 * @Date 2022/10/9 2:32 PM
 * @Created by fuwk
 * -Xms60m -Xms60m -XX:SurvivorRatio=8
 *
 */
public class GCTest {

    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            byte[] bytes = new byte[1024 * 100];//100KB
            list.add(bytes);
            try {
                Thread.sleep(120);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }


    }

}
